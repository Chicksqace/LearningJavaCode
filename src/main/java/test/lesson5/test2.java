package test.lesson5;

import java.time.*;
public class test2 {

    public static void main(String[] args) {

        LocalDate date=LocalDate.now();
        int month=date.getMonthValue();//获取本月
        int today=date.getDayOfMonth();//获取本天

        date=date.minusDays(today-1);//将date设置为这个月的第一天
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();//得到星期几的一个数值，1就返回1，2就是2.......
        System.out.println("  一  二  三   四   五  六  日");
        for(int i=1;i<value;i++) {
            System.out.print("    ");
        }
        while(date.getMonthValue()==month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth()==today) {//如果获取到当前的日期就做标记
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            date=date.plusDays(1);//plusDays（） 方法用于将给定的持续时间（以天为单位）添加到此 LocalDate 并返回 LocalDate。返回值是1，通过这个重新编码
            if(date.getDayOfWeek().getValue()==1) {
                System.out.println("");//换行的作用
            }
        }
    }
}


