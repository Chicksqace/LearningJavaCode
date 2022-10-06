package test.lesson5;

import java.util.Calendar;

public class test {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int dayOfMonth = c.getActualMaximum(Calendar.DATE);//传入这个月可能有几天
        int today = c.get(Calendar.DAY_OF_MONTH);//当前日
        c.set(Calendar.DAY_OF_MONTH, 1);//设置当月第一天
        int firstDayWeek = c.get(Calendar.DAY_OF_WEEK) -1;//？ 获取今日周几
        /*System.out.println(today);
        System.out.println(firstDayWeek);*/
        if (firstDayWeek == 0) firstDayWeek += 7;
        System.out.println("一 二 三 四 五 六 日");
        for (int i = 0; i < firstDayWeek - 1; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= dayOfMonth; i++) {
            if (i < 10 && (i + firstDayWeek - 1) % 7 != 0)
                System.out.print(" " + i +" ");
            else if ((i + firstDayWeek - 1) % 7 == 0)
                System.out.println(i);
            if (i >= 10 && (i + firstDayWeek - 1) % 7 != 0)
                System.out.print(i + " ");

        }
    }
}
