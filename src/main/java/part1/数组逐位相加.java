package part1;

import java.util.Arrays;
public class 数组逐位相加 {
    public static void main(String[] args) {
        /*
        int nums1[]={3,8,9};
        int nums2[]={5,2,8};
        int nums3[]=new int[3];
        int sum;
        for (int i=0;i<=nums1.length-1;i++)
        {
            sum=nums1[i]+nums2[i];
            nums3[i]=sum;
        }
        String s =Arrays.toString(nums3);
        System.out.println(s);*/
        int nums1[]={3,8,9};
        int nums2[]={5,2,8,11};
        if(nums1.length!=nums2.length)
        {
            System.out.println("长度不一样");
            return;
        }
        int nums3[]=new int[nums1.length];
        for (int i=0;i<nums1.length;i++)
        {
            nums3[i]=nums1[i]+nums2[i];
        }
        System.out.println(Arrays.toString(nums3));

        //优化
    }
}
