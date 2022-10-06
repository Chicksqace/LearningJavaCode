package test.lesson2;

public class OutStateStudent extends Student
{
    @Override
    public void showStudent() {
        System.out.println(OUTSTATE_RATE*hours);
    }

}