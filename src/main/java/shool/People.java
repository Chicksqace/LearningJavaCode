package shool;

import java.text.SimpleDateFormat;
import java.util.Date;

class test1 {

    public static void main(String[] args) {
        //int[] ints=new int[]{1,2,3,4};
        Date dt=new Date();
        int year=dt.getYear()+1900;
        People p=new People();
        p.setName("张三");
        String bd="1996/03/01";
        String hqbd=bd.substring(0,4);
        int new_year=year-Integer.valueOf(hqbd);
        //System.out.println(new_year);
        p.setBirthday(bd);
        p.setSex("男");
        p.setWeight(50);
        p.setHeight(1.80);

        System.out.println("姓名:"+p.getName());

        System.out.println("出生日期："+p.getBirthday());

        System.out.println("性别："+p.getSex());

        System.out.println("身高："+p.getHeight());

        System.out.println("体重："+p.getWeight());

        System.out.println("年龄为"+new_year);


    }

}
public class People{


    private String name;

    public int getAge() {
        return Age;
    }

    public People setAge(int age) {
        Age = age;
        return this;
    }

    public int Age;

    public String getBirthday() {
        return birthday;
    }

    public People setBirthday(String birthday) {
        this.birthday = birthday;

        return this;
    }

    private String birthday;

    private String sex;

    private double height;

    public double getWeight() {
        return weight;
    }

    public People setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAccount(int a, int b)
    {
        return a+b;
    }
}
