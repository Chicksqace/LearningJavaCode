package Part4;

import com.yzk18.commons.IOHelpers;

public class 统计视频播放量 {
    public static void main(String[] args) {
        String[] lines= IOHelpers.readAllLines("D:\\temp\\视频播放量.txt");
        int sum=0;//总次数
        for (String line:lines)
        {
            /*提高效率
            if (line.contains("次观看"))
            {
                System.out.println(line);
                int idexofci=line.indexOf("次观看");//次观看的位置
                String s=line.substring(0,idexofci);
                //System.out.println(s);
                int count=Integer.valueOf(s);
                //System.out.println(count);
                sum = sum+count;
            }*/
            int indexofci=line.indexOf("次观看");
            if (indexofci>=0)
            {
                String s=line.substring(0,indexofci);
                //System.out.println(s);
                int count=Integer.valueOf(s);
                //System.out.println(count);
                sum = sum+count;
            }
        }
        System.out.println("总次数"+sum);
    }
}
