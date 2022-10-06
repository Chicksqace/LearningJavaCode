package part2;

import java.util.Arrays;

public class 字符串案例1 {
    public static void main(String[] args) {
        String s="c:/a/b/c.txt";
        /*
        int lastIndexOfSlash=s.lastIndexOf('/');//找到最后一个/位置
        String flname=s.substring(lastIndexOfSlash+1);//substring取字符串/当前位置+1到结尾
        System.out.println(flname);
        String[] strs=s.split("/");//数组遇到/分割
        String filname=strs[strs.length-1];//将最后数组最后一个元素打印出来
        System.out.println(filname);*/
        int s1=s.lastIndexOf(".");
        String flname=s.substring(s1);
        System.out.println(flname);

    }
}
