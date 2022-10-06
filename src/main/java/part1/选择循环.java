package part1;

public class 选择循环
{
    public static void main(String[] args)
    {
        /*
        int age = 28;
        if (age > 10)
        {
            System.out.println("成年人");
        };*/
        /*
        int age=18;
        if (age>=18)
        {
            System.out.println("成年人");
        }
        else
        {
            System.out.println("未成年人");
        }*/
        int age=17;
        if (age<0)
        {
            System.out.println("年龄不能为负数");
        }
        else if(age<=5)
        {
            System.out.println("婴儿");
        }
        else if (age<=18)
        {
            System.out.println("儿童");
        }
        else
        {
            System.out.println("成人");
        }
        System.out.println("over");
    }
}

