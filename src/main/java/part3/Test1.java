package part3;

public class Test1 {
    public static void main(String[] args) {
        /*int x=5;
        int i=add(x,3);*/
        //int i=add(3,5);
        int i1=5;
        int i2=3;
        int i=add(i1,i2);
        System.out.println(i);

    }
    static int add(int i1,int i2)//s计算俩数和
    {
        int i3=i1+i2;
        return i3;
        //return i1+i2;
    }
}
