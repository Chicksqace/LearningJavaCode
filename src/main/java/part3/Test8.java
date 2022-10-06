package part3;

public class Test8 {
    public static void main(String[] args) {
        System.out.println(test1(8));
    }
    static int test1(int i) {
        /*if (i==8)
        {
            return 999;
        }
        if (i==9)
        {
            return 111;
        }
        else
        {
            return 11;
        }*/
        if (i>0)
        {
            return 1;
        }
        if (i<=0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
