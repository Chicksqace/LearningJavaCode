package test.lesson1;

public class Main {
    public static void main(String[] args) {
        Shape s=new Square(10);
        System.out.println(s.perimeter());
        System.out.println(s.getArea());
        Shape c=new Circle(10);
        System.out.println(c.getArea());
        System.out.println(c.perimeter());

    }
}
