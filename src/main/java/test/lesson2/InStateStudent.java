package test.lesson2;

public class InStateStudent extends Student{
    @Override
    public void showStudent() {
        System.out.println(INSTATE_RATE * hours);
    }
}
