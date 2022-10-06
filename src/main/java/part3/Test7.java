package part3;

import com.yzk18.commons.IOHelpers;

import java.io.File;

public class Test7 {
    public static void main(String[] args) {
        printfile("D:\\temp\\1111.txt");

    }
    static void printfile(String filename)
    {
        /*
        File file=new File(filename);
        if(file.exists()==false)//if(!file.exists())
        {
            System.out.println("文件不存在");
        }
        else
        {
            String s= IOHelpers.readAllText(file);
            System.out.println(s);
        }*/
        File file=new File(filename);
        if(file.exists()==false)//if(!file.exists())
        {
            System.out.println("文件不存在");
            return;
        }
            String s= IOHelpers.readAllText(file);
            System.out.println(s);
    }
}
