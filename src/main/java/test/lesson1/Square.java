package test.lesson1;

public class Square extends Shape{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public double perimeter()
    {
        return 4*a;
    }

    @Override
    public double getArea() {
        return a*a;
    }
}
