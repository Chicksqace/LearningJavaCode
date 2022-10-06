package com.name.pack1;

public class Dog {
      String name="旺财";
      String breed="哈奇";

    public void sleep()
    {
        System.out.println(name+"在睡觉");
    };
    public void bite(Human h)
    {
        System.out.println(name+"咬了"+h.name);
    };
}
