package part3;

import java.util.Arrays;

public class CatMain {
    public static void main(String[] args) {
        /*Cat c1=new Cat();
        c1.setName("花花");
        c1.setAge(1);
        c1.setHeigtht(33);*/
        //System.out.println(c1.getName()+"年龄是"+c1.getAge());
        Cat c=new Cat().setAge(18).setName("花花").setHeigtht(12);
        test(c);//相当于Cat c=new Cat();
        //Cat c1=c.setAge(18)
        //Cat c2=c.setName("花花")
        //Cat c3=c.setAge(12)
    }
    static void test(Cat c)
    {

    }
}
