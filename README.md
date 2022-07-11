# 云E办在线办公系统后台

-该系统主要分为三个module，分别是yeb-generator,yeb-mail,yeb-server.
 >yeb-generator：只是一个简单的代码生成器，利用逆向工程从数据库中读取表，自动生成controller，service，mapper，以及mapper.xml映射
 
 >yeb-mail：主要是对mail邮箱依赖的配置，以及对应消息队列中的queue的定义，其中MailReceiver类中设置手动返回ACK保证消息的**幂等性**，如果失败将会持久化保存到数据库中
 
 >yeb-server：该项目中的核心，基本的增删改查，全局异常处理，以及各种中间件的配置全在里面。亮点：在task包下有定义MailTask类，实现功能：每10秒钟扫描数据库中t_mail_log表，将之前失败的消息使用list缓存起来重新发送，当然表中有一个字段名为count，count是发送的次数，如果count等于3次，就不再重发，保证消息的**可靠性**
## UML diagrams

```mermaid
sequenceDiagram
Server ->> Client: 同步请求发送邮件
Client ->> Server: 手动返回ACK告知服务端邮件发送成功
Server -x Client: 发送邮件失败，将msg持久化
Server ->> Client: 重发三次，如果还不能成功则放弃
