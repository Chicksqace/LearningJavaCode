package test.lesson4;

public class Apple extends Fruit implements Eatable{
    String type;

    @Override
    public void beEatted() {
        System.out.println("苹果被吃了");
    }
}
