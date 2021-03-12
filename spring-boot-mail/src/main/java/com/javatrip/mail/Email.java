package com.javatrip.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 公众号：Java旅途
 * @Description 邮件发送
 * @Date 2020-10-19 14:52
 */
@RestController
public class Email {

    @Autowired
    private JavaMailSender mailSender;


    // http://127.0.0.1:7023/send/qqMail
    @GetMapping("send/qqMail")
    private void sendQqMail(){

        SimpleMailMessage message = new SimpleMailMessage();
        // 发件人
        message.setFrom("491118612@qq.com");
        // 收件人
        message.setTo("491118612@qq.com");
        // 邮件标题
        message.setSubject("qqMail");
        // 邮件内容
        message.setText("qqMail");
        // 抄送人
        message.setCc("lzy_lio@163.com");
        mailSender.send(message);
    }

    // http://127.0.0.1:7023/send/163Mail
    @GetMapping("send/163Mail")
    private void send163Mail(){

        SimpleMailMessage message = new SimpleMailMessage();
        // 发件人
        message.setFrom("lzy_lio@163.com");
        // 收件人
        message.setTo("lzy_lio@163.com");
        // 邮件标题
        message.setSubject("163Mail");
        // 邮件内容
        message.setText("163Mail");
        // 抄送人
        message.setCc("491118612@qq.com");
        mailSender.send(message);
    }
}
