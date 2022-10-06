package part3;

import java.util.LinkedHashMap;

public class 键值对2 {
    public static void main(String[] args) {
        LinkedHashMap map=new LinkedHashMap();
        map.put("张三",20);
        map.put("李四",45);
        map.put("王五",66);
        System.out.println(map.get("王五"));
    }


}
