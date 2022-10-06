package part3;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class 泛型1 {
    public static void main(String[] args) {
        /*
        LinkedList<String> list1=new LinkedList<String>();
        list1.add("zzzz");
        //list1.add(3)
        String s=list1.get(0);
        System.out.println(s);*/
         /*
        LinkedHashMap<String,String> map1=new LinkedHashMap<>();//键和值都是String类型
        map1.put("dog","狗");
        //map1.put("dog",3);
        String s=map1.get("dog");
        System.out.println(s);
          */
        //LinkedList<int> list1=new LinkedList<int>();
        /*
        LinkedList<Integer> list1=new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        int i=list1.get(1);
        System.out.println(i); */
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("张三",20);
        map.put("李四",45);
        map.put("王五",66);
        Integer i=map.get("张三1");
        if (i==null)
        {
            System.out.println("查无成绩");
        }
        else
        {
            System.out.println(i);
        }

    }
}
