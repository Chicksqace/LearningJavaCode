package part3;

public class Dog {
    private String name="无名氏";
    private int age=18;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int value)
    {
        this.age=value;
    }
    public void sayHello()
    {
        System.out.println("你好，我是"+this.name+",我的年龄是"+this.age);
        String name="多多";
        System.out.println(name);
    }
}
