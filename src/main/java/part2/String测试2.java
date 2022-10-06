package part2;

public class String测试2 {
    public static void main(String[] args) {
        /*String s="我是世界上最丑的人，我讨厌我！";
//        s.replace("我","小明");
//        System.out.println(s);这是错误的，因为replace是有返回值的
        String s1=s.replace("我","小明");//字符串替换
        System.out.println(s1);*/
        /*
        String s="wo,ai,ni,xiao,jie,jie";
        String[] str=s.split(",");//按照，号分割字符串
        for (String s1:str)
        {
            System.out.println(s1);
        }
        String s1="wo ai ni xiao jie jie";
        String[] str1=s1.split(" ");//按照空格分割字符串
        for (String s2:str1)
        {
            System.out.println(s2);
        }*/
        /*
        String s="http://www.baidu.com";
        if (s.startsWith("https://")||s.startsWith("http://"))//s.startsWith以什么什么开头
        {
            System.out.println("这是一个网址");
        }
        else
        {
            System.out.println("不是网址");
        }*//*
        String s="a.txt";
        System.out.println(s.endsWith(".txt"));//s.endsWith(".txt")是否已.txt结尾
        System.out.println(s.endsWith(".exe"));
        System.out.println(s.endsWith("a."));*/
        //判断是否是邮箱，包含@，并且不能以开头@开头以及结尾，必须以.com结尾
        //123@qq.com
        String email="123@qq.com";
        if (email.contains("@")&&!email.endsWith("@")&&!email.startsWith("@"))
        {
            System.out.println("合法邮箱");
        }
        else
        {
            System.out.println("不是邮箱");
        }
    }
}
