package Part4;

import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.WordTemplateRenderer;

import java.util.HashMap;

public class Word模板测试 {
    public static void main(String[] args) {
        String tFile="d:/temp/模板.docx";//模板文件
        String outputFile="d:/temp/模板1.docx";//输出文件
        HashMap<String,Object>data=new HashMap<>();
        data.put("{姓名}","张三");//替换
        data.put("{专业名}","计算机应用技术");
        byte[] bytes= IOHelpers.readAllBytes("D:\\temp\\图片\\0.png");
        data.put("学生照片",bytes);
        //data.put("学生照片","我来");
        WordTemplateRenderer.render(tFile,data,outputFile);//原目标，数据，现目标
    }
}
