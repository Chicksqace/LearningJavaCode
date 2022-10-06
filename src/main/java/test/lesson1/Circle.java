package test.lesson1;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
}
