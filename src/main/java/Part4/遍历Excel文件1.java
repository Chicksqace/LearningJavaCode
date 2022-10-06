package Part4;

import com.yzk18.docs.ExcelHelpers;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class 遍历Excel文件1 {
    public static void main(String[] args) {
        Workbook workbook=ExcelHelpers.openFile("d:/temp/工作簿1.xlsx");
        for (int sheetIndex=0;sheetIndex<workbook.getNumberOfSheets();sheetIndex++)//遍历sheet
        {
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            for (int rowIndex=sheet.getFirstRowNum();rowIndex<=sheet.getLastRowNum();rowIndex++)//getFirstRowNum(),getLastRowNum()有效的行号开始，有效的行号结束
            {
                Row row = sheet.getRow(rowIndex);
                if (row==null)
                {
                    continue;
                }
                for (int colIndex=row.getFirstCellNum();colIndex<=row.getLastCellNum();colIndex++)//有效的列号开始，有效的列号结束
                {
                    Cell cell = row.getCell(colIndex);
                    if (cell==null)
                    {
                        continue;
                    }
                    String value=ExcelHelpers.getCellStringValue(cell);//处理公式有点问题
                    System.out.println(value);
                }
            }
        }
        ExcelHelpers.close(workbook);
    }
}
