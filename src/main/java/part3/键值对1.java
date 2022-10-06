package part3;

import java.util.LinkedHashMap;

public class 键值对1 {
    public static void main(String[] args) {
        LinkedHashMap map1=new LinkedHashMap();//键-值,key-value
        map1.put("hello","你好");
        map1.put("dog","狗");
        System.out.println(map1.get("dog"));
        System.out.println(map1.get("bird"));
        map1.put("dog","犬");
        System.out.println(map1.get("dog"));
        String s="cat";
        Object obj=map1.get(s);
        if (obj==null)
        {
            System.out.println("查无此词");
        }
        else
        {
            System.out.println("结果为"+obj);
        }
    }
}
