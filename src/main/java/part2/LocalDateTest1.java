package part2;

import java.time.LocalDate;
public class LocalDateTest1 {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.now();
        System.out.println(d1);
        LocalDate d2=LocalDate.of(2008,9,30);
        System.out.println(d2);
        LocalDate d3=LocalDate.parse("2022-01-18");
        System.out.println(d3);
        System.out.println(d3.getYear());
        System.out.println(d3.getMonth());//枚举类型的月
        System.out.println(d3.getMonthValue());//整形的月
        System.out.println(d3.getDayOfMonth());//这个月的第几天
        System.out.println(d3.getDayOfWeek());//这周的第几天
        System.out.println(d3.getDayOfYear());//这年的第几天
    }
}

