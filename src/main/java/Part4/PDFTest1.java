package Part4;

import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.PDFHelpers;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.util.List;

public class PDFTest1 {
    public static void main(String[] args) {
        PDDocument doc =PDFHelpers.openFile("D:\\temp\\PDF\\柏可心宠物食品商业计划书.pdf");
        System.out.println(doc.getNumberOfPages());//查找页数
        PDPage page=doc.getPage(34);//因为程序是从零开始的，因此我们获取到的页数为42页
        String s=PDFHelpers.parseText(page);//识别PDF中的文字
        System.out.println(s);
        List<byte[]>images=PDFHelpers.parseImages(page,"png");//解析这一页的图片
        //for (byte[] bytes:images)
        for (int i=0;i<images.size();i++)
        {
            byte[] bytes=images.get(i);
            IOHelpers.writeAllBytes("D:/temp/"+i+".png",bytes);//将图片bytes保存在路径上
        }
        PDFHelpers.close(doc);
    }
}
