package part2;

public class 字符串方法1 {
    public static void main(String[] args) {
        String s="hello";
        //int[] nums={3,5,6};
        //System.out.println(nums.length);
        System.out.println(s.length());//s.length()是方法所以有（）;字符的长度
        char c1=s.charAt(1);//获取字符串第一个字符，默认从0开始
        System.out.println(c1);
        System.out.println(s.contains("le"));//判断字符串中是否存在字符串，要连续的
        System.out.println(s.contains("el"));

    }
}
