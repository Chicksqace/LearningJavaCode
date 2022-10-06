package part2;


public class 字符串判断是否jpg案例 {
    public static void main(String[] args) {
        String s="c:/a/w.jPeG";
        if (s.toLowerCase().endsWith("jpg")||s.toUpperCase().endsWith("JPG"))
        {
            System.out.println("是jpg文件");
        }
        else
        {
            System.out.println("error");
        }
    }

}
