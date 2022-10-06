package com.name.pack1;

public class TestCar {
    //public static int  Num= 0;
    public static void main(String[] args) {
        Car c1 = new Car("浙Ayu", 80, 30);
        c1.show();
        //Num += c1.getNum();
        Car c2 = new Car("浙Ayu2", 80, 20);
        //Num += c2.getNum();
        c2.show();
        System.out.println("车的总数量为"+Car.Num);
    }
}
