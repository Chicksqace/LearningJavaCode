package Part4;

import com.yzk18.net.MailSender;

import java.io.File;

public class 发送邮件测试 {
    public static void main(String[] args) {
        /*
        MailSender mailSender=new MailSender();
        mailSender.setHostName("smtp.126.com");//smtp的地址
        mailSender.setUserName("cpy021115958667454@126.com");//smtp用户名
        mailSender.setPassword("NJYEBWCVIRSKIKVQ");//授权码
        mailSender.setFrom("cpy021115958667454@126.com");//发送者邮箱
        mailSender.addTo("3473802279@qq.com");//发送给谁的邮箱
        mailSender.setSubject("明天下午我们部门开个会");//标题
        mailSender.setTextMessage("在5号会议室，中午管饭");//设置正文
        mailSender.send();//发送*/
        MailSender mailSender=new MailSender();
        mailSender.setHostName("smtp.126.com");//smtp的地址
        mailSender.setUserName("cpy021115958667454@126.com");//smtp用户名
        mailSender.setPassword("NJYEBWCVIRSKIKVQ");//授权码
        mailSender.setFrom("cpy021115958667454@126.com");//发送者邮箱
        mailSender.addTo("515937123@qq.com");//发送给谁的邮箱
        mailSender.setSubject("JM校园");//标题
        mailSender.setTextMessage("在附件中");//设置正文
        mailSender.addAttachment(new File("C:\\Users\\PC\\Desktop\\电子商务完成部分\\3月1日/已完成部分.docx"));//设置附件
        mailSender.send();//发送


    }
}
