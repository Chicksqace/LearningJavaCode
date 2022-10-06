package part2;

import com.yzk18.GUI.GUI;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.ImageHelpers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class GUITest1 {
    public static void main(String[] args) {
        String s=GUI.buttonsBox("你好","张三","李四");//弹出包含多个按钮的对话框
        System.out.println(s);
        //String s=GUI.choiceBox("你好",new String[]{"张三","李四"});//弹出一个有多个可选值的对话框
        //System.out.println(s);
        //LocalDate d1=GUI.dateBox("请你选择你的生日");//这些对话框是“模态”对话框，也就是窗口关闭之后，才继续往下执行
        //LocalDate d1=GUI.dateBox("请你选择你的生日",LocalDate.of(2003,7,13));//弹出日期选择对话框。
        //LocalDateTime d2=GUI.datetimeBox("请选择你的时间");//弹出日期时间选择对话框。
        //System.out.println(d2);
//        String s=GUI.dirOpenBox("请选择打开文件夹");//弹出目录打开对话框
//        System.out.println(s);
        //String s=GUI.dirSaveBox("请选择保存文件夹");//弹出目录保存的对话框，如果目录已经存在，则提示【是否覆盖】
        //System.out.println(s);
        //Double d=GUI.doubleBox("请输入体重",9.9);//弹出允许用户输入一个double值的对话框
        //System.out.println(d);
        //GUI.errorBox("出错了");//弹出报错消息对话框。
        //String s=GUI.fileOpenBox("请选择一个ptt","ptt","pttx");//弹出文件打开对话框
        //System.out.println(s);
        //String[] s=GUI.filesOpenBox("请选择一个ptt","ptt","pttx");//弹出文件打开多文件对话框
        //System.out.println(s);
        //System.out.println(GUI.getScreenWidth()+"-"+GUI.getScreenHeight());//获取屏幕高度,宽度
        //String s =GUI.imgBox("图片","D:\\temp\\img/1.png","太美了","丑死了");//弹出显示图片的对话框
        //System.out.println(s);
        //String s=GUI.inputBox("你的姓名是","无名");//弹出允许用户输入一段字符串的对话框
        //System.out.println(s);
        //String[] strs=GUI.loginBox("请登录");//弹出登录对话框
        //System.out.println(Arrays.toString(strs));
        //GUI.msgBox("完成");//弹出普通消息对话框
        //String[]strs=GUI.multiInputBox("请输入详细信息","姓名","年龄","生日");//弹出有多个输入内容的对话框
        //System.out.println(Arrays.toString(strs));
        //Boolean b=GUI.okCancelBox("你是人吗？");//弹出包含【确认】、【取消】两个按钮的消息对话框
        //System.out.println(b);
        //String s=GUI.passwordBox("密码");//弹出密码对话框
        //System.out.println(s);
        /*GUI.showIndeterminateProgressDialog("正在导入");//（显示“非确定性”进度对话框，非模态对话框。）非模态对话框，不用等对话框关闭，代码就继续往后运行
        for (int i=0;i<5;i++ )
        {
            byte[] bytes= IOHelpers.readAllBytes("D:\\temp/11.txt");
            IOHelpers.writeAllBytes("d:/temp/22.text",bytes);
        }
        GUI.closeIndeterminateProgressDialog();
        GUI.msgBox("导入完成");
        //Java：大部分情况，main函数执行结束了程序就结束了*/

        for (int i=0;i<6000;i++)
        {
            GUI.showProgressDialog("正在导入第"+i+"次",6000,i);//显示进度显示对话框，非模态对话框。
            byte[] bytes= IOHelpers.readAllBytes("D:\\temp/11.txt");
            IOHelpers.writeAllBytes("d:/temp/22.text",bytes);
        }
        GUI.closeProgressDialog();
        GUI.msgBox("导入完成");

    }
}
