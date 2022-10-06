package test.lesson4;

public class Test {
    public static void main(String[] args) {
        Pet cat = new Cat();
        cat.infoShow();
        Cat c=new Cat();
        c.bark();
        Fruit fruit=new Fruit();
        Eatable apple=new Apple();
        Eatable banana=new Banana();
        fruit.beEatted(apple);
        fruit.beEatted(banana);

    }
}
