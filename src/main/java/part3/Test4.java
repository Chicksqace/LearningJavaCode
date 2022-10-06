package part3;

public class Test4 {
    public static void main(String[] args) {
        int i=5;
        test(i);
        System.out.println(i);

    }
    static void test(int a)
    {
        System.out.println("之前"+a);
        a=9;
        System.out.println("之后"+a);
    }
}
