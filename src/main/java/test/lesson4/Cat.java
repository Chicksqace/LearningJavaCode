package test.lesson4;

public class Cat extends Pet {
    @Override
    public void infoShow() {
        System.out.println("这是猫");
    }
    public void bark(){
        System.out.println("bark");
    }
}
