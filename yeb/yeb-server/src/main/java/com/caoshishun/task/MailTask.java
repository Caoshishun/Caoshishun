package com.caoshishun.task;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.caoshishun.pojo.Employee;
import com.caoshishun.pojo.MailConstants;
import com.caoshishun.pojo.MailLog;
import com.caoshishun.service.IEmployeeService;
import com.caoshishun.service.IMailLogService;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 功能描述：
 *  邮件定时发送定时任务
 * @author 曹世顺
 * @version 1.0
 * @date 2022/2/15 0015 21:38
 */
@Component
public class MailTask {

    @Autowired
    private IMailLogService mailLogService;

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    /**
     * 10秒执行一次
     */
    @Scheduled(cron = "0/10 * * * * ?")
    public void mailTask(){
        List<MailLog> list = mailLogService.list(new QueryWrapper<MailLog>().
                eq("status", 0).lt("tryTime", LocalDateTime.now()));
        list.forEach( mailLog ->{
            //如果重试次数超过3次，更新状态为投递失败，不再重试
            if(mailLog.getCount() >= 3){
                mailLogService.update(new UpdateWrapper<MailLog>().set("status",2).
                        eq("msgId",mailLog.getMsgId()));
            }
            mailLogService.update(new UpdateWrapper<MailLog>().set("count",mailLog.getCount()+1).set("updateTime",
                    LocalDateTime.now()).set("tryTime",LocalDateTime.now().plusMinutes(MailConstants.MSG_TIMEOUT)).eq("msgId",mailLog.getMsgId()));
            Employee emp = employeeService.getEmployee(mailLog.getEid()).get(0);
            //重新发送信息
            rabbitTemplate.convertAndSend(MailConstants.MAIL_EXCHANGE_NAME,MailConstants.MAIL_ROUTING_KEY_NAME,
                    emp,new CorrelationData(mailLog.getMsgId()));
        });
    }
}
