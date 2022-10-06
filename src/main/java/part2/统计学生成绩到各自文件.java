package part2;

import com.yzk18.commons.IOHelpers;

public class 统计学生成绩到各自文件 {
    public static void main(String[] args) {
        String[] lines=IOHelpers.readAllLines("D:/temp/成绩.txt");
        for (String line:lines)
        {
            String[] strs=line.split(",");
            //System.out.println(line);
            String name=strs[0];
            double 语文=Double.parseDouble(strs[1]);//Double.parseDouble()将String类型转换为Double类型
            double 数学=Double.parseDouble(strs[2]);
            double 英语=Double.parseDouble(strs[3]);
            double 平均分=((语文+数学+英语)/3);
            String msg=name+"你好，语文成绩为"+语文+"\n数学成绩为"+数学+"\n英语成绩为"+英语+"\n平均分为"+平均分;
            String fileName="D:/temp/a/"+name+".txt";
            System.out.println(fileName);
            IOHelpers.writeAllText(fileName,msg);

        }
    }
}
