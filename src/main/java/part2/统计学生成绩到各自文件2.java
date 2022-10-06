package part2;

import com.yzk18.commons.IOHelpers;

import java.util.Arrays;

public class 统计学生成绩到各自文件2 {
    public static void main(String[] args) {
        String[]  lines= IOHelpers.readAllLines("d:/temp/成绩.txt");
        String[] news=new String[lines.length]; //创建空字符串数组
        for (int i=0;i<lines.length;i++)
        {
            String[] splits= lines[i].split(",");// lines[i].split(",")分成了三个数组
            //System.out.println(Arrays.toString(splits));
            double avgsum=0;
            for (int p=1;p<splits.length;p++)
            {
                avgsum = avgsum + Double.parseDouble(splits[p]);//成绩和
                //System.out.println(avgsum);
            }
            double pjf=avgsum/(splits.length-1);
            String name=splits[0];//取出姓名
            //System.out.println(splits[1]);
            news[i]=name.replace(" ","")+  "平均成绩： " +pjf;//组合，同时去除姓名中间空格
            System.out.println(news[i]);
        }
        //System.out.println(Arrays.toString(news));
        IOHelpers.writeAllLines("d:/temp/chengji.txt",news);
    }
}

