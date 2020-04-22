package cn.rk6216.eureka_client_user_update8102.service;

/**
 *  邮件发送
 *  @author: Lizq
 *  @Date: 2020/4/15 21:22
 */
public interface IMailService {

    /**
     * 发送文本邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     */
    void sendSimpleMail(String to, String subject, String content);

}