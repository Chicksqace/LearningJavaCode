package part2;
public class 字符串登陆案例 {
    public static void main(String[] args) {
        String username=" Admin ";
        String password="1234561";
        if (username.trim().equalsIgnoreCase("admin")&&password.equals("123456"))//trim()去除俩段空格，equalsIgnoreCase不区分大小写
        {
            System.out.println("ok");
        }
        else
        {
            System.out.println("error");
        }
    }
}
