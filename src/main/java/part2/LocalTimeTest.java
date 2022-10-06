package part2;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime t1=LocalTime.now();
        System.out.println(t1);
        LocalTime t2=LocalTime.of(8,5,20);
        System.out.println(t2);
        LocalTime t3=LocalTime.parse("02:06:09");
        System.out.println(t3);
        System.out.println(t1.getHour());//获取小时
        System.out.println(t1.getSecond());//获取秒
        System.out.println(t1.getMinute());//获取分钟
    }
}
