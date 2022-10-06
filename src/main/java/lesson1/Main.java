package lesson1;

public class Main {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        Pet p=new Pet();
       /* p.setHungery(10);
        d.setFurColor("毛色灰色");
        d.bark();
        d.eat();
        c.setEyeColor("眼睛黄色");
        c.bark();
        c.eat();
        Master m=new Master();
        m.feed(c);
        m.amuse(d);*/
        /*多态思想*/
        Pet dog=new Dog();//向上
        dog.eat();
        dog.bark();
        /*Cat cat=(Cat) dog;//向下
        cat.eat();
        cat.bark();*/

    }
}
