package test.lesson4;

public class Banana extends Fruit implements Eatable{
    @Override
    public void beEatted() {
        System.out.println("香蕉被吃了");
    }
}
