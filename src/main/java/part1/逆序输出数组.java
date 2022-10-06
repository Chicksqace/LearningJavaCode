package part1;

public class 逆序输出数组 {
    public static void main(String[] args) {
        String[] names={"yzk","zack","yang"};
        for (int i=names.length-1;i>=0;i--)
        {
            System.out.println(names[i]);
        }
    }
}
