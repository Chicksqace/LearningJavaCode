package part3;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person();
        //Person p1：声明了一个Person类型的变量p1
        // new Person()：创建Person类的对象：把Person类实例化
        // Person p1=new Person();声明了一个Person类型的变量p1,创建Person类的对象;把变量p1指向这个对象
        p1.setAge(18);//调用p1变量“当前所指向对象”的setAge方法
        p1.SetName("小明");
        p1.sayHello();
        Person p2=new Person();
        p2.setAge(17);
        p2.sayHello();
        p1.sayHello();
        //Person.setAge();
        Person.hi();
    }
}
