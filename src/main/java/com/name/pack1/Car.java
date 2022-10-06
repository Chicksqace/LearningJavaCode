 package com.name.pack1;

public class Car {
    private String carNo;//车牌号
    private int speed;//车速
    public  int num;//总数量

    public static int  Num= 0;
    public int getNum() {
        return num;
    }

    public Car setNum(int num) {
        this.num = num;
        return this;
    }

    public Car(String carNo, int speed, int num) {
        this.carNo = carNo;
        this.speed = speed;
        this.num = num;
        Num+=num;
    }

    public void highSpeed(int sp)
    {
        speed+=sp;
    }
    public void lowSpeed(int sp)
    {
        speed-=sp;
    }

    public String getCarNo() {
        return carNo;
    }

    public Car setCarNo(String carNo) {
        this.carNo = carNo;
        return this;
    }

    public void changeCarNo(String bb)
    {
        carNo=bb;
    }

    public void show()
    {
        System.out.println("车牌号："+carNo+"，车速："+speed+"，车队中车的总数量："+Num);
    }

}