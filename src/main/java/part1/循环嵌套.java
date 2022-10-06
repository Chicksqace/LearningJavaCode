package part1;

public class 循环嵌套 {
    public static void main(String[] args) {
        for (int i=0;i<3;i++)//i=0,i=1
        {
            System.out.println("内层之前");
            for (int j=1;j<=3;j++)
            {
                System.out.println(i+","+j);//0,1;0,2;0,3;1,1;1,2;1,3
            }
            System.out.println("内层之后");
        }
    }
}
