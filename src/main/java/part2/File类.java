package part2;

import java.io.File;

public class File类 {
    public static void main(String[] args) {
        File f1=new File("d:/temp/1.txt");
//        System.out.println(f1);
        File f2=new File("D:/BaiduNetdiskDownload/6000大学生创业计划书（解压）/PPT模版/0001 ppt模板1");
//        System.out.println(f2);
        File f3=new File("d:/temp");
//        System.out.println(f3);
        File f4=new File("d:/temp/3.txt");
//        System.out.println(f4);
        /*
        f1.delete();
        f3.delete();*//*
        System.out.println(f1.exists());
        System.out.println(f3.exists());
        System.out.println(f2.exists());*/
        /*
        System.out.println(f1.isFile());
        System.out.println(f3.getPath());
        System.out.println(f2.isFile());
         */
        String[] files=f3.list();
        for (String file:files)
        {
            System.out.println(file);
        }


    }
}
