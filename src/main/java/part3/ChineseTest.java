package part3;

public class ChineseTest {
    public static void main(String[] args) {
        /*
        Chinese c1=new Chinese();
        c1.setAge(50);
        c1.SetName("小米");
        c1.setHukou("上海");
        c1.sayHello();*/
        Person p1=new Chinese();//父类类型的变量可以指向子类类型的对象
        //能调用什么方法，取决于变量的类型
        p1.setAge(12);
        p1.SetName("s");
        //p1.sethokong();
        Chinese p2=(Chinese)p1;//显示转换，(Chinese)程序员确定：p1指向的一定是Chinese对象
        p2.setHukou("某都");
        System.out.println(p2.getHukou());
        p2.setAge(1111);
        p1.sayHello();
        System.out.println(p2.getHukou());
        Object obj=p1;
        System.out.println(obj.getClass());

    }
}
