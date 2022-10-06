package part1;

public class Text运算符 {
    public static void main(String[] args) {
        /*
        int i=1+2+4+7;
        System.out.println(i);*/
        //int i=(1+(2-4))/7;
        int i=1/3*3;
        //double d=1/3;//整数和整数运算，结果还是整数
        double d=1.8/3;//整数和非整数运算,结果是小数
        System.out.println(i);
        String name="chen";
        String name2="pan";
        String s=name+" "+name2+d;//字符串连接起来，形成新的字符串
        System.out.println(s);
        /**
         * 表达式从左向右执行（除非（）改变优先级）
         * 其他数据类型遇到字符串，之后都是按照字符串进行计算
         */
        System.out.println(1+"1"+1);//"11">"111"
        System.out.println(1+1+"1");//2>"21"
        System.out.println("1"+1+1);//"11">"111"
        System.out.println("1"+(1+1));//"12"
        System.out.println(3+(6+"a")+("b"+(1+2)*3));

    }
}
