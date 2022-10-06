package Part4;

import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.PDFHelpers;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.File;
import java.io.IOException;

public class PDF文件合并 {
    public static void main(String[] args) throws IOException {
        PDDocument newPdDoc=new PDDocument();//新文件的文档
        String[] pdfFiles = IOHelpers.getFilesRecursively("D:\\temp\\2", "pdf");
        for (String pdfFile : pdfFiles) {
            PDDocument pdDoc = PDFHelpers.openFile(pdfFile);
            for (int i = 0; i < pdDoc.getNumberOfPages(); i++)
            {
                PDPage page=pdDoc.getPage(i);
                newPdDoc.addPage(page);

            }
            //PDFHelpers.close(pdDoc);
        }
        newPdDoc.save("D:\\temp\\2\\合并.pdf");
    }
}
