package game;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] arr=new int[]{6,3,4,4,8,5,7,1,0,9};
        int[] index=new int[]{2,5,1,3,4,0,2,6,4,5,2};
        String tel="";
        for (int i:index)
        {
            tel+=arr[i];
        }
        System.out.println("冲突");
        System.out.println("练习方式"+tel);
        System.out.println("你好");
        System.out.println("push");
        System.out.println("pull");
    }
}
