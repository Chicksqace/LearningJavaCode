package part1;

public class 数组1 {
    public static void main(String[] args) {
        /*
        int[] num1={1,2,4,5,6,5};
        int[] num2=new int[10];
        System.out.println(num2[2]);
        num1[1]=8;
        System.out.println(num1[1]);
        num1[0]=num1[1]+num1[2];
        System.out.println(num1[0]);*/
        int a[]={1,2,3};
        a[0]=10;
        a[1]=a[0]+1;
        a[2]=a[1]+a[0];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

    }
}
