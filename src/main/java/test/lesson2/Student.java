package test.lesson2;

public abstract class Student {
    final static double INSTATE_RATE=75;//里面
    final static double OUTSTATE_RATE=200;//外面
    String name;//名字

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }
    int hours;//学分数

    public int getHours() {
        return hours;
    }

    public Student setHours(int hours) {
        this.hours = hours;
        return this;
    }

    public abstract void showStudent();//计算学费
    public final void showSchool()//打印账单
    {
        System.out.println("州立大学,学生姓名"+name+"所选学分"+hours+"账单总额"+(INSTATE_RATE * hours));
    }
}
