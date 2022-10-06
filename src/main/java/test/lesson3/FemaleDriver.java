package test.lesson3;

public class FemaleDriver extends Driver{
    public FemaleDriver(String gender,int age){
        super(gender, age);
    }
    void drives(Vehicle v){
        System.out.println("A female drives a "+v.getType()+",id is "+v.getId()+".");
    }
}
