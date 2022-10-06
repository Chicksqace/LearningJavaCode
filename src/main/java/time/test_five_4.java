package time;

import java.util.Scanner;

public class test_five_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入个数:");
        int[] arr = new int[in.nextInt()];
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("输入第(" + (i + 1) + ")个数:");
            arr[i] = in.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {//冒泡排序
            if (arr[i]>arr[i+1]){
                int k = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]=k;
            }
            for (int j = 0; j < arr.length; j++) {//输出这些数
                System.err.println(arr[i]+" ");
            }
        }

    }
}
