package test.lesson2;

public class Mian {
    public static void main(String[] args) {
        Student i=new InStateStudent();
        Student o=new OutStateStudent();
        i.setName("厘米");
        i.setHours(60);
        System.out.println(i.getHours());
        System.out.println(i.getName());
        o.showStudent();
        o.showSchool();
        o.setName("米");
        o.setHours(70);
        System.out.println(o.getHours());
        System.out.println(o.getName());
        o.showStudent();
        o.showSchool();
    }
}
