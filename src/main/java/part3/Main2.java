package part3;

public class Main2 {
    public static void main(String[] args) {
        /*int i=10;
        int j=i;//10 让i“当前”值赋值给j，相当于拷贝一份
        System.out.println(j);
        i=20;
        System.out.println(j);*/
        Person xm=new Person();
        xm.setAge(18);// xm.setAge=18
        xm.SetName("小明");
        xm.sayHello();
        Person niuren=xm;//把xm“当前指向的对象”赋值给niuren
        //让niuren变量指向xm"当前指向的对象"
        //Person niuren=new Person();
        niuren.setAge(80);
        niuren.SetName("张三");
        niuren.sayHello();
        xm.sayHello();
    }
}
