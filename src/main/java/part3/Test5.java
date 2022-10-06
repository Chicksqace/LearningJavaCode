package part3;

public class Test5 {
    public static void main(String[] args) {
        System.out.println(calc(11));
        hello(-6);
    }
    static void hello(int i1)
    {
        if (i1<=0)
        {
            System.out.println("必须正数");
            return;
        }
        System.out.println("你输入的是"+i1);
        i1++;
        System.out.println("自增之后是"+i1);
    }
    static int calc(int i1)
    {
        if (i1>10)
        {
            return 10;
        }
        else if (i1>=0&&i1<=9)
        {
            return 9;
        }
        else {
            return -1;
        }
    }
}
