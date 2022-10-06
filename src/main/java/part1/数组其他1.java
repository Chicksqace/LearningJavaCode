package part1;

public class 数组其他1 {
    public static void main(String[] args) {
        /*
        String[] strs=new String[5];
        System.out.println(strs.length);
        int len=strs.length;
        System.out.println(len);*/
        /*int[] nums={3,88,888,9999,11111};//第0的元素遍历到length-1个元素
        for (int i=0;i<=nums.length-1;i++)//i是下标
        {
            int n=nums[i];
            System.out.println(n);
        }*/
        /*
        int[] nums2={3,88,888,9999,11111};//第0的元素遍历到length-1个元素
        for (int i=nums2.length-1;i>=0;i--)//i是下标
        {
            System.out.println(nums2[i]);*/
        /*
        int[] nums2={3,88,888,9999,11111};
        for (int n:nums2)//遍历nums2每个元素，每个遍历到的元素用n变量来获取，对于每个遍历到的元素，都执行一次循环体
        {
            System.out.println(n);
        }*/
        /*String[] strs={"asf","dgd","fadsga"};
//        for (int i=0;i<strs.length;i++)
//        {
//            System.out.println(strs[i]);
//        }
        for (String s:strs)
        {
            if (s.equals("asf"))
            {
                continue;
            }
            System.out.println(s);
        }
        System.out.println("for结束了");*/
        int[] nums={22,43,43525,5436};
        String[] strs={"asf","dgd","fadsga"};
        System.out.println(nums);
        System.out.println(strs);//toString()

    }
}
