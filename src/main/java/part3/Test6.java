package part3;

public class Test6 {
    public static void main(String[] args) {
        int i=getmax(3,8);
        System.out.println(i);

    }
    static int getmax(int i1,int i2)//比较最大值
    {
        if (i1>i2)
        {
            return i1;
        }
        else
        {
            return i2;
        }
    }
}
