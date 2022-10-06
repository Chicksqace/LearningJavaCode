package Part4;

import com.yzk18.docs.PDFHelpers;
import com.yzk18.docs.WordHelpers;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.util.List;

public class PDF2Word {
    public static void main(String[] args) {
        PDDocument pdfDoc = PDFHelpers.openFile("D:\\pdf/60_御剑队_决赛展示PPT.pdf");//打开文档
        XWPFDocument docx = WordHelpers.createDocxDocument();//创建Word文档
        int pages=pdfDoc.getNumberOfPages();
        //for (int i=0;i<pdfDoc.getNumberOfPages();i++)这样写不优化，太消耗时间了
        for (int i=0;i<pages;i++)
        {
            PDPage page =pdfDoc.getPage(i);//遍历每一页
            String pageText = PDFHelpers.parseText(page);//遍历文本
            List<byte[]> images = PDFHelpers.parseImages(page, "png");//获取图片
            WordHelpers.createRun(docx,pageText);//这样就能插入到Word里吗？
            for (byte[] imgBytes:images)
            {
                WordHelpers.addPicture(docx,imgBytes);//插入图片
            }
        }
        WordHelpers.saveToFile(docx,"D:\\pdf/60_御剑队_决赛展示PPT.docx");
        //WordHelpers.openDocx("C:\\Users\\PC\\Desktop\\完成部分\\学长参考部分.docx");
        WordHelpers.close(docx);
        PDFHelpers.close(pdfDoc);
    }
}
