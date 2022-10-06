package part2;

import com.yzk18.GUI.GUI;

import java.time.LocalDate;

public class 计算星座 {
    public static void main(String[] args) {
        LocalDate birthDay=GUI.dateBox("请输入生日");
        //System.out.println(birthDay.getMonthValue());
        int month=birthDay.getMonthValue();
        int day=birthDay.getDayOfMonth();
        if (month==3)
        {
            if (day<=20)
            {
                System.out.println("双鱼座");
            }
            else
            {
                System.out.println("白羊座");
            }
        }
        else if (month==4)
            if (day<=19)
            {
                System.out.println("白羊座");
            }
            else
            {
                System.out.println("金牛座");
            }
        else if (month==5)
            if (day<=20)
            {
                System.out.println("金牛座");
            }
            else
            {
                System.out.println("双子座");
            }
        else if (month==6)
            if (day<=21)
            {
                System.out.println("双子座");
            }
            else
            {
                System.out.println("巨蟹座");
            }
        else if (month==7)
            if (day<=22)
            {
                System.out.println("巨蟹座");
            }
            else
            {
                System.out.println("狮子座");
            }
        else if (month==8)
            if (day<=22)
            {
                System.out.println("狮子座");
            }
            else
            {
                System.out.println("处女座");
            }
        else if (month==9)
            if (day<=22)
            {
                System.out.println("处女座");
            }
            else
            {
                System.out.println("天秤座");
            }
        else if (month==10)
            if (day<=23)
            {
                System.out.println("天秤座");
            }
            else
            {
                System.out.println("天蝎座");
            }
        else if (month==11)
            if (day<=21)
            {
                System.out.println("天蝎座");
            }
            else
            {
                System.out.println("射手座");
            }
        else if (month==12)
            if (day<=21)
            {
                System.out.println("射手座");
            }
            else
            {
                System.out.println("摩羯座");
            }
        else if (month==1)
            if (day<=19)
            {
                System.out.println("摩羯座");
            }
            else
            {
                System.out.println("水瓶座");
            }
        else if (month==2)
            if (day<=18)
            {
                System.out.println("水瓶座");
            }
            else
            {
                System.out.println("双鱼座");
            }

    }
}
