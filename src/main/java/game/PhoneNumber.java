package game;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] arr=new int[]{6,2,4,3,8,5,7,1,0,9};
        int[] index=new int[]{7,5,9,5,4,0,0,6,2,5,2};
        String tel="";
        for (int i:index)
        {
            tel+=arr[i];
        }
        System.out.println("练习方式"+tel);

        System.out.println("你好");
    }
}
