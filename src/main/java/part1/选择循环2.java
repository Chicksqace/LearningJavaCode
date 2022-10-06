package part1;

public class 选择循环2 {
    public static void main(String[] args) {
//        int i=5;
//        if (i==6);
//        {
//            System.out.println("666");
//        }
//        System.out.println("over");
        /*
        int i=5;
        if(i==6)
        {
            System.out.println("666");
        }
        else
        {
            System.out.println("555");
        }*/
        /*
        int age=20;
        if(age>18)
        {
            System.out.println("大于18");
            if(age>30)
            {
                System.out.println("大于30");
            }
            else
            {
                System.out.println("小于30");
            }
        }*/
        int m = 11;
        switch (m)
        {
            case 1:
                break;
            case 2:
                System.out.println("a");
                break;
            case 5:
            case 8:
                System.out.println("b");
                return;
            case 9:
                System.out.println("d");
                return;
            default:
                System.out.println("c");
                break;
        }



    }
}
