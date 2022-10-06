package part3;

public class Test2 {
    public static void main(String[] args) {
    //hello(3,8);
        /*
        int x=3;
        hello(x,8);*/
        int i1=5;
        int i2=3;
        //hello(i1,i2);
        hello(i2,i1);//hello(3,5)按照顺序，不是按名字
    }
    static void hello(int i1,int i2)//没有返回值
    {
        //int i1=6;
        System.out.println("i1 is"+i1+",i2 is"+i2);
    }
}
