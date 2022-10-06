package part3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class 异常1 {
    public static void main(String[] args)
    {
        /*
        String s="123 ";
        int i=Integer.parseInt(s);
        System.out.println(i);
        NumberFormatException ex=null;
        NumberFormatException ex1=new NumberFormatException();*/
        //AA();
        /*try {
            FileInputStream fis=new FileInputStream("d/1.txt");
        }
        catch (FileNotFoundException ex)//异常取一个名字
        {
            System.out.println("文件不存在");
        }*/
        //FileInputStream fis=new FileInputStream("d:/temp/11.txt");
        /*try {
            BB();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("cc");
        }*/
        try {
            BB();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);//通过构造函数的方法将这个异常包起来往下传
        }


    }
    public static void BB()
            throws FileNotFoundException
    {
        FileInputStream fis=new FileInputStream("d:/temp/11111111.txt");
    }
    public static void AA()
    {
        try {
            Integer.parseInt("ab");//把可能发生异常的代码用try包起来
        }
        catch (NumberFormatException ex)//如果发生这个异常什么办
        {
            System.out.println("解析数字错误");
        }
        System.out.println("AA结束");
    }
}
