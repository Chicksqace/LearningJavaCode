package test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;
public class 模拟发送 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();//要发送的信息个数
        sendoMsg(n);
    }
    private static void sendoMsg(int n) throws Exception {
        Robot robot=new Robot();
        robot.delay(1000);//延迟，方便打开对话框
        for (int i=0;i<n;i++){
            robot.keyPress(KeyEvent.VK_CONTROL);//模拟按下ctrl
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);//松开
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_ENTER);//回车
            robot.delay(100);
        }
    }
}
