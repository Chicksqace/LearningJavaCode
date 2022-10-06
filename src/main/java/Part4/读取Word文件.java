package Part4;

import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.WordHelpers;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFPicture;
import org.apache.poi.xwpf.usermodel.XWPFPictureData;

public class 读取Word文件 {
    public static void main(String[] args) {
        XWPFDocument doc = WordHelpers.openDocx("D:\\temp\\1/参考碳路者--1.20会议内容.docx");
        String s=WordHelpers.readAllText("D:\\\\temp\\\\1/参考碳路者--1.20会议内容.docx");//读Word文件
        System.out.println(s);
        for (XWPFPictureData pic : doc.getAllPictures())
        {
            IOHelpers.writeAllBytes("d:/temp/pics/"+pic.getFileName(),pic.getData());
        }
        WordHelpers.close(doc);
    }
}
