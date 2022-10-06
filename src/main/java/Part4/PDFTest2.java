package Part4;

import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.PDFHelpers;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.util.List;

public class PDFTest2 {
    public static void main(String[] args) {
        PDDocument doc = PDFHelpers.openFile("C:\\Users\\PC\\Desktop\\电子商务完成部分\\2月24日/众筹1.pdf");//打开文档
        String text=PDFHelpers.parseText(doc);//解析所以文本
        IOHelpers.writeAllText("C:\\Users\\PC\\Desktop\\电子商务完成部分\\2月24日/众筹1.txt",text);//将解析到的文本text放入路径
        int imgNumber=0;
        for (int i=0;i<doc.getNumberOfPages();i++)//获得总页数
        {
            PDPage page=doc.getPage(i);//挨页遍历，拿到其中的一页
            List<byte[]> images=PDFHelpers.parseImages(page,"png");//解析出这一页中的图片
            for (byte[] bytes:images)//读取到图片二进制的内容
            {
                IOHelpers.writeAllBytes("C:\\Users\\PC\\Desktop\\电子商务完成部分\\2月24日/图片/"+imgNumber+".png",bytes);//将读取的内容保存到路径中
                imgNumber++;//图片的编号
            }
        }

        PDFHelpers.close(doc);
    }
}
