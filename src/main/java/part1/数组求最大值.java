package part1;

public class 数组求最大值 {
    public static void main(String[] args) {
        int nums[]={-3,-5,-999,-2,-12};
        int max=nums[0];
        for (int i=0;i<=nums.length-1;i++)
        {
            int n=nums[i];
            if (n>max)
            {
                System.out.println(n+"比目前最大值"+max+"大，因此更新最大值为"+n);
                max=n;
            }
            else
            {
                System.out.println(n+"不比目前最大值"+max+"大");
            }
        }
        System.out.println(max);
    }
}
