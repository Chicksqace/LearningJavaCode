package Part4;

import com.yzk18.commons.IOHelpers;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PDF文件合并2 {
    public static void main(String[] args) throws IOException {
        PDFMergerUtility mergerUtility=new PDFMergerUtility();
        String[] pdfFiles = IOHelpers.getFilesRecursively("D:\\temp\\2", "pdf");
        for (String pdfFile : pdfFiles)
        {
            mergerUtility.addSource(pdfFile);
        }
        mergerUtility.setDestinationFileName("D:\\temp\\2\\合并.pdf");
        mergerUtility.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());
    }
}
