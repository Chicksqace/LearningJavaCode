package test.lesson4;

public class Duck extends Pet implements Eatable{
    public void infoShow() {
        System.out.println("这是鸭子");
    }
    public void swim(){
        System.out.println("swim");
    }

    @Override
    public void beEatted() {
    }
}
