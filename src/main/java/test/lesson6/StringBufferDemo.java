package test.lesson6;
public class StringBufferDemo {//定义公共类StringBufferDemo
    public static void main(String[] args) {//用来测试类
        // TODO Auto-generated method stub
        System.out.println("----------本程序输出结果如下----------");//打印
        char c1, ch1[] = new char[13];//定义对象c1, ch1[]
        String str1 = "";
        StringBuffer sbufstr1;
        boolean flag = true;
        sbufstr1 = new StringBuffer("NewStrBuffer");
        str1 = sbufstr1.toString();
        str1 = str1 + ":";
        System.out.println(sbufstr1);
        System.out.println(str1);
        ch1 = str1.toCharArray();
        System.out.println(ch1);
        sbufstr1 = sbufstr1.append(flag);
        sbufstr1 = sbufstr1.append(123);
        sbufstr1 = sbufstr1.append(12L);
        sbufstr1 = sbufstr1.append(3.14F);
        sbufstr1 = sbufstr1.append("计算机");
        sbufstr1 = sbufstr1.append(new StringBuffer("应用技术19"));
        System.out.println(sbufstr1);
        sbufstr1 = sbufstr1.insert(6, "ing");
        System.out.println(sbufstr1);
        sbufstr1 = sbufstr1.insert(sbufstr1.length(), ":");
        System.out.println(sbufstr1);
        sbufstr1 = sbufstr1.insert(0, flag);
        System.out.println(sbufstr1);
        sbufstr1 = sbufstr1.insert(0, ch1, 6, 3);
        System.out.println(sbufstr1);
        sbufstr1 = sbufstr1.insert(0, 12);
        System.out.println(sbufstr1);
        sbufstr1 = sbufstr1.insert(0, 12L);
        System.out.println(sbufstr1);
        sbufstr1 = sbufstr1.insert(0, 3.14F);
        System.out.println(sbufstr1);
        sbufstr1 = sbufstr1.insert(0, new StringBuffer("计应19"));
        System.out.println(sbufstr1);
        str1 = "You have a ";
        sbufstr1 = sbufstr1.replace(0, 12, str1);
        System.out.println("testing");
        System.out.println(sbufstr1);
        sbufstr1.delete(3, 6);
        System.out.println(sbufstr1);
        sbufstr1.deleteCharAt(2);
        System.out.println(sbufstr1);
        sbufstr1.setLength(0);
        System.out.println("new:"+sbufstr1);
        sbufstr1.append("计算机应用技术2019");
        System.out.println(sbufstr1);
        c1 = sbufstr1.charAt(3);
        System.out.println(c1);
        str1 = sbufstr1.substring(3);
        System.out.println(str1);
        str1 = sbufstr1.substring(3, 7);
        System.out.println(str1);
        sbufstr1.reverse();
        System.out.println(sbufstr1);
        str1 = sbufstr1.toString();
        System.out.println(str1);
        System.out.println("----------本程序输出已经结束----------");
    }
}

