package Part4;

import com.yzk18.docs.ExcelHelpers;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class 创建Excel文件1 {
    public static void main(String[] args) {
        XSSFWorkbook worbook = ExcelHelpers.createXLSX();
        XSSFSheet sheet = worbook.createSheet();
        ExcelHelpers.setCellValue(sheet,0,0,"姓名");
        ExcelHelpers.setCellValue(sheet,0,1,"年龄");
        ExcelHelpers.setCellValue(sheet,0,2,"手机号");

        ExcelHelpers.setCellValue(sheet,1,0,"小明");
        ExcelHelpers.setCellValue(sheet,1,1,18);
        ExcelHelpers.setCellValue(sheet,1,2,"18888888888888");

        ExcelHelpers.setCellValue(sheet,2,0,"小红");
        ExcelHelpers.setCellValue(sheet,2,1,19);
        ExcelHelpers.setCellValue(sheet,2,2,"139999999999999");

        ExcelHelpers.saveToFile(worbook,"d:/temp/1.xlsx");
    }
}
