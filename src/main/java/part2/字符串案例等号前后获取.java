package part2;

public class 字符串案例等号前后获取 {
    public static void main(String[] args) {
        String s1="name=小姐姐";
        String[] s2=s1.split("=");
        System.out.println(s2[0]);
        System.out.println(s2[1]);
    }
}
