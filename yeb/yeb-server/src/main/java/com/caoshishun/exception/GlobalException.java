package com.caoshishun.exception;

import com.caoshishun.pojo.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 功能描述：
 * 全局异常处理
 * @author 曹世顺
 * @version 1.0
 * @date 2022/2/11 0011 14:02
 */

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(SQLException.class)
    public RespBean mySqlException(SQLException e){
        if(e instanceof SQLIntegrityConstraintViolationException){
            return RespBean.error("该数据库有关联数据，操作失败！");
        }
        return RespBean.error("数据库异常，操作失败");
    }
}
