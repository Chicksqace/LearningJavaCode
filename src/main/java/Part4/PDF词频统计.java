package Part4;

import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.PDFHelpers;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class PDF词频统计 {
    public static void main(String[] args) {
        //System.out.println(isEnglishWord("电"));
        String dir="D:/temp/2";
        String[] pdfFiles=IOHelpers.getFilesRecursively(dir,"pdf");//遍历这个文件夹下所有的文件
        LinkedHashMap<String,Integer>map=new LinkedHashMap<>();//声明一个字典
        for (String pdfFile:pdfFiles)//遍历每个PDF文件
        {
            PDDocument doc=PDFHelpers.openFile(pdfFile);
            String text=PDFHelpers.parseText(doc);//读取这个pdf所有的文本
            String[] words=text.toLowerCase().split("\\s|\\.|\\,|\\?||\\:|\\!|\\?|;|\\(|\\)|·");//分割出单词
            for (String word:words)//遍历单词
            {
                //if (isEnglishWord(word)==false)
                if (!isEnglishWord(word))//如果这个Word不是英文单词就跳过
                {
                    continue;//处理下一个单词
                }
                if (word.equals(""))//跳过空白字符
                {
                    continue;
                }
                //可是这样写会把跟”非字母“连在一起的单词也给忽略了呀
                //是否是全部由字母组成的
                Integer freq=map.get(word);//获得当前的词频
                if (freq==null)
                {
                    map.put(word,1);//之前没有出现过这个单词，记录为1
                }
                else
                {
                    map.put(word,freq+1);//如果出现过则递增
                }
            }

            PDFHelpers.close(doc);
        }
        String outputString="";
        for (String word:map.keySet())//map.keySet()//返回所有key的集合
        {
            Integer freq=map.get(word);
            //System.out.println(word+"="+freq);
            outputString=outputString+word+" "+freq+"\r\n";
        }
        IOHelpers.writeAllText("d:/temp/英文.txt",outputString);
    }

//判断s是否为一个英文单词(全部由英文字母组成)
    public static boolean isEnglishWord(String s)
    {
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            //Character.isAlphabetic()判断给定的是不是一个英文单词
            //遍历整个字符串中每一个字符是不是英文
            if (Character.isLowerCase(ch)==false)//只要碰到一个非字母，函数就返回false
            {
                return false;
            }
        }
        return true;//如果运行到这里，就说明每个都是字母

    }
}
