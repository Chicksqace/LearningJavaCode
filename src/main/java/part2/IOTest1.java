package part2;
import com.google.zxing.Result;
import com.yzk18.commons.DesktopHelpers;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.ImageHelpers;
import com.yzk18.commons.QRCodeHelpers;

import javax.naming.spi.DirStateFactory;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;

public class IOTest1 {
    public static void main(String[] args) {
        //IO:输入输出 helpr助手
        //String s=IOHelpers.readAllText("d:/temp/1.txt");
        //System.out.println(s);
        //File file=new File("D:\\temp\\a");
        //file.delete();//删除不了
        //IOHelpers.deleteDir(file);
        //IOHelpers.deleteDir("D:\\temp\\1 - 副本");//String类型删除
//        System.out.println(IOHelpers.detectTextEncoding("D:\\temp/1.txt"));//文件编码，基础概率，内容太少就检查不出来
//        System.out.println(IOHelpers.getExtension("D:\\temp/1.txt"));//文件的扩展名
//        System.out.println(IOHelpers.getFileName("D:\\temp/1.txt"));//得到文件路径file中只有文件名的部分
//        System.out.println(IOHelpers.getFileNameWithoutExtension("D:\\temp/1.txt"));//得到文件路径file中不包含扩展名的文件名。
        //File file =new File("C:\\Users\\PC\\Downloads\\yzk18-commons-1.5-javadoc");
        //System.out.println(Arrays.toString(file.list()));//只能获得该目录下的文件名，没有子目录下的文件名
        //String[] files = IOHelpers.getFilesRecursively("C:\\\\Users\\\\PC\\\\Downloads\\\\yzk18-commons-1.5-javadoc","html");//所以文件夹下的所以html文件打印下
        //System.out.println(Arrays.toString(files));
        //String[] files=IOHelpers.getFilesRecursively("D:/","mp4");
        //System.out.println(Arrays.toString(files));
//        System.out.println(IOHelpers.getTempDirectory());//得到系统临时目录的路径。
//        System.out.println(IOHelpers.getUserDirectory());//得到系统当前用户的用户目录的路径。
//        byte[] bytes=IOHelpers.readAllBytes("D:/temp/1.txt");//byts数组的内容
//        System.out.println(Arrays.toString(bytes));
//        String[] lines=IOHelpers.readAllLines("D:/temp/1.txt");//文本内容为一个数组，数组一个元素对应文本中的一行。
//        System.out.println(Arrays.toString(lines));
//          byte[] bytes={2,2,32,42,43,22,55};
//          IOHelpers.writeAllBytes("D:/temp/2.mp3",bytes);//把字节数组bytes写入文件file。
//          byte[] bytes=IOHelpers.readAllBytes("D:\\BaiduNetdiskDownload\\6000大学生创业计划书（解压）\\PPT模版\\0002 ppt模板2\\VR体验馆商业计划书.ppt");
//          IOHelpers.writeAllBytes("D:/temp/商业计划书.ptt",bytes);//拷贝文件
          /*String[] lines={"你好","我好"};
          IOHelpers.writeAllLines("d:/temp/1111.txt",lines);//数组覆盖式的写入到文件
          IOHelpers.writeAllText("d:/temp/11.txt","21244124\nsdfsags");//以字符串的形式写入*/
        //DesktopHelpers桌面助手
        //DesktopHelpers.editFile("d:/temp/1.txt");
        //String s=DesktopHelpers.getClipboardText();//复制剪贴板内容
        //System.out.println(s);//String类型，没有就返回null
//        DesktopHelpers.setClipboardText("//剪贴板内容");//设置剪贴板内容
//        DesktopHelpers.openUrl("http://www.baidu.com");//将网页打开
//        QRCodeHelpers()//二维码生成类
        //中文有问题
        BufferedImage img= QRCodeHelpers.generateQRCodeImage("httpw://baidu.com",200,200);
        ImageHelpers.writeToFile(img,"png","d:/temp/baidu.png");
        Result result =QRCodeHelpers.parseImage("d:/temp/baidu.png");
        System.out.println(result.getText());

    }
}
