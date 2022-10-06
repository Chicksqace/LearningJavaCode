package part3;

public class Main4 {
    public static void main(String[] args) {
        Person p1=new Person();//只有new出来的才是一个新对象
        p1.setAge(18);
        p1.SetName("小明");
        p1.sayHello();
        test(p1);
        p1.sayHello();
    }
    static void test(Person p)//p和p1指向同一个对象
    {
        p.setAge(80);
    }
}
