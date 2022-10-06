package part3;

public class Main3 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(18);
        p1.SetName("小明");
        Person p2=p1;
        p1=new Person();
        p1.SetName("张三");
        p1.setAge(80);
        p2.sayHello();
        p1.sayHello();
    }
}
