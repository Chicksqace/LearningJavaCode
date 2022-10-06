package part2;

import com.yzk18.GUI.GUI;
import com.yzk18.commons.IOHelpers;

import java.util.Arrays;

public class 计算单词总个数 {
    public static void main(String[] args) {
        /*
        String s="hello i am chenpanyu,how are you?";
        String[] strs=s.split("\\s|\\.|\\?|\\!|,");//正则表达式\\转义|或者
        System.out.println(Arrays.toString(strs));*/
        String dir= GUI.dirOpenBox("选择一个包含英文txt文件的文件夹");
        String[] files= IOHelpers.getFilesRecursively(dir,"txt");
        int sum=0;
        for (String file:files)
        {
            String s=IOHelpers.readAllText(file);
            String[] strs=s.split("\\s|\\.|\\?|\\!|,");//分割出来的单词
            sum=sum+strs.length;//数组strs.length=单词的个数
        }
        System.out.println(sum);

    }
}
