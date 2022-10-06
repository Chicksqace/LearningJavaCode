package test.lesson3;

public class MaleDriver extends Driver{
    MaleDriver(String gender,int age){
        super(gender,age);
    }
    void drives(Vehicle v){
        System.out.println("A man drives a "+v.getType()+" "+v.getId()+".");
    }
}