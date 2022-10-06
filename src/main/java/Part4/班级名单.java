package Part4;

import com.yzk18.docs.ExcelHelpers;
import com.yzk18.docs.WordTemplateRenderer;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.time.LocalDate;
import java.util.HashMap;

public class 班级名单 {
    public static void main(String[] args) {
        String tfile="D:\\temp\\工资条\\名单模板.docx";
        String excelFile="D:\\temp\\工资条\\文件夹取名.xlsx";//读取Excel文件
        Workbook workbook = ExcelHelpers.openFile(excelFile);
        int sheetsNum= workbook.getNumberOfSheets();
        for (int sheetIndex=0;sheetIndex<sheetsNum;sheetIndex++)
        {
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            String 部门名称=sheet.getSheetName();
            int lastRowNum=sheet.getLastRowNum();
            for (int rowIndex=1;rowIndex<=lastRowNum;rowIndex++)//跳过表头，从第一行开始
            {
                //Row row = sheet.getRow(rowIndex);
                String 姓名=ExcelHelpers.getCellStringValue(sheet,rowIndex,0);
                //System.out.println(部门名称+姓名+工号+","+基本工资+","+奖金+","+考勤罚款+","+实发工资);
                HashMap<String,Object>data=new HashMap<>();//模板数据准备好
                data.put("[员工姓名]",姓名);
                data.put("[日期]", LocalDate.now());
                String outFile="d:/temp/工资条/1/"+姓名+".docx";
                WordTemplateRenderer.render(tfile,data,outFile);
            }
        }

    }
}
