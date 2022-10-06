package game;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] arr=new int[]{6,2,4,3,8,5,7,1,0,9};
        int[] index=new int[]{2,5,1,3,4,0,2,6,4,5,2};
        String tel="";
        for (int i:index)
        {
            tel+=arr[i];
        }
        System.out.println("练习方式"+tel);

        System.out.println("你好");
    }
}
