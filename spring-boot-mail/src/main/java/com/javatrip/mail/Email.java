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




    // http://127.0.0.1:7023/send
    @GetMapping("send")
    private void send(){

        SimpleMailMessage message = new SimpleMailMessage();
        // 发件人
        message.setFrom("491118612@qq.com");
        // 收件人
        message.setTo("491118612@qq.com");
        // 邮件标题
        message.setSubject("take your time");
        // 邮件内容
        message.setText("你好，这是一条用于测试Spring Boot邮件发送功能的邮件！哈哈哈~~~");
        // 抄送人
        message.setCc("lzy_format@163.com");
        mailSender.send(message);
    }
}
