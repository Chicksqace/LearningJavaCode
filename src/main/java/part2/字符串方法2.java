package part2;

import java.util.Locale;

public class 字符串方法2 {
    public static void main(String[] args) {
        /*
        String s1="ABC";
        String s2="ACB";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写比较字符串*/
        /*
        String s="我是小米，我是帅气的小米，你好了，你好帅";
        System.out.println(s.indexOf("小米"));//indexOf()是第一次出现位置，lastIndexOf()最后一次出现的位置.默认从零开始数
        System.out.println(s.indexOf("xiaomi"));//找不到返回-1
        System.out.println(s.lastIndexOf("小米"));
        System.out.println(s.indexOf("你好"));
        System.out.println(s.lastIndexOf("你好"));*/
        /*
        String s="我是小米，我是帅气的小米，你好了，你好帅";
        String s1=s.substring(3);
        System.out.println(s1);
        String s2=s.substring(3,5);
        System.out.println(s2);
        String s="      你  好       ";//去除俩边的空格
        String s1=s.trim();
        System.out.println(s1);
        String s2=s.replace(" ","").trim();
        System.out.println(s2);
        String s3="     你好     ";
        String s4="你好";
        boolean b1=s3.equals(s4);
        System.out.println(b1);*/
        String s="sdasfsagg";
        String s1=s.toLowerCase(Locale.ROOT);
        System.out.println(s1);
        String s2=s.toUpperCase(Locale.ROOT);
        System.out.println(s2);
    }
}
