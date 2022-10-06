package part2;

import com.yzk18.GUI.GUI;

public class 标准体重计算器 {
    public static void main(String[] args) {
        String 性别=GUI.buttonsBox("选择你的性别","男","女");
        double 身高=GUI.doubleBox("你的身高");
        double 体重=GUI.doubleBox("你的体重");
        double 标准体重;
        if (性别.equals("男"))//字符串比较要用equals，不能用==
        {
            //double 标准体重=(身高-80)*0.7;//这样不行
            标准体重=(身高-80)*0.7;//全局声明变量，局部赋值变量
            //double 和标准体重差=(体重-标准体重)/标准体重;//DRY不要拷贝代码
            //System.out.println(标准体重);
        }
        else
        {
            //double 标准体重=(身高-70)*0.6;
            标准体重=(身高-70)*0.6;
            //System.out.println(标准体重);
            //double 和标准体重差=(体重-标准体重)/标准体重;
        }
        double 和标准体重差=(体重-标准体重)/标准体重;
        if (和标准体重差>=-0.1&&和标准体重差<=0.1)
        {
            GUI.msgBox("你好标准");
        }
        else if (和标准体重差>=-0.2&&和标准体重差<=-0.1)
        {
            GUI.msgBox("偏瘦");
        }
        else if (和标准体重差>0.1&&和标准体重差<=0.2)
        {
            GUI.msgBox("偏胖");
        }
        else if (和标准体重差>0.2)
        {
            GUI.msgBox("太胖了，胖的不行，快减肥");
        }
        else if (和标准体重差<-0.2)
        {
            GUI.msgBox("太瘦了，瘦的不行，快吃点");
        }

    }
}
