package part1;

public class BreakText {
    public static void main(String[] args) {
        /*for (int i=1;i<=5;i++)
        {
            if (i==3)
            {
                //break;
                continue;
            }
            System.out.println(i);
        }*/
        /*
        for(int i=0;i<=10;i++)
        {
            if (i%2==0)//求余
            {
                //continue;
                break;
            }
            System.out.println(i);
        }
        System.out.println("over");*/
        int i=0;
        while (i<10)
        {
            if (i==5)
            {
                //break;
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("over");
    }
}
