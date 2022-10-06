package part3;

public class IntTest {
    public static void main(String[] args) {
        //int i=null;这是不行的，基本数据类型不能nulln
//        System.out.println(i1);
//        Integer i2=null;
//        System.out.println(i2);
//        int i3=i1;
//        System.out.println(i3);
//        int i4=i2;
//        System.out.println(i4);
//
//        Long l1=null;
//        Boolean b1=null;
        MyInteger i1 =new MyInteger();
        i1.setValue(1);
        System.out.println(i1.getValue());
    }
}
