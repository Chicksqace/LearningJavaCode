package part3;

public class Cat {
    private int age;
    private String name;
    private int heigtht;
    public Cat setAge(int age)//写
    {
        this.age=age;
        return this;
    }
    public int getAge()//读
    {
        return this.age;
    }
    public Cat setName(String name)
    {
        this.name=name;
        return this;
    }
    public String getName()
    {
        return this.name;
    }
    public Cat setHeigtht(int heigtht)
    {
        this.heigtht=heigtht;
        return this;
    }
    public int getHeigtht()
    {
        return this.getHeigtht();
    }
}
