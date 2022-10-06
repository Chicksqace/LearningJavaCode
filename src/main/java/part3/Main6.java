package part3;

import com.yzk18.GUI.GUI;

import java.time.LocalDate;

public class Main6 {
    public static void main(String[] args) {
        //int i=null;
        Person p1=null;
        Person p2=new Person();
        p1=new Person();
        Person p3=null;
        p1.height=5;
        LocalDate d1=GUI.dateBox("选择日期");
        if (d1==null)
        {
            System.out.println("没有选择日期");
        }
        else
        {
            System.out.println(d1.getMonthValue());
        }


    }
}
