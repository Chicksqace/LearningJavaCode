package part3;

import java.util.Arrays;
import java.util.LinkedList;

public class 数据结构 {
    public static void main(String[] args) {
//        int[] nums1=new int[]{2,32,22};//长度在声明的时候就确定了，无法在运行时改变数组对象的长度
//        int[] nums2=nums1;
//        nums1=new int[]{2,32,2,21};//创建了一个新的数组对象
//        System.out.println(Arrays.toString(nums1));
//        System.out.println(Arrays.toString(nums2));
        LinkedList list1=new LinkedList();
        list1.add(3);
        list1.add(6);
        list1.add(5);
        list1.add("113");
//        System.out.println(list1.size());
//        System.out.println(list1.get(1));
        /*
        for (int i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i));}*/
        for (Object obj:list1)
        {
            System.out.println(obj);
        }
    }
}
