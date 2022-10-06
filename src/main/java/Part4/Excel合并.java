package Part4;

import com.yzk18.commons.IOHelpers;
import com.yzk18.docs.ExcelHelpers;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Arrays;

public class Excel合并 {
    public static void main(String[] args) {
        String dir="D:\\temp\\工资条";
        String[] excelFiles= IOHelpers.getFilesRecursively(dir,"xlsx");
        //System.out.println(Arrays.toString(excelFiles));
        XSSFWorkbook newworkbook = ExcelHelpers.createXLSX();//创建一个新的xlsx文件，在这里写入内容
        XSSFSheet newsheet = newworkbook.createSheet();//创建sheet
        //创建表头
        ExcelHelpers.setCellValue(newsheet,0,0,"部门");
        ExcelHelpers.setCellValue(newsheet,0,1,"姓名");
        ExcelHelpers.setCellValue(newsheet,0,2,"电话");
        ExcelHelpers.setCellValue(newsheet,0,3,"性别");
        int rowNum=1;//行号
        for (String excelFile:excelFiles)
        {
            if (excelFile.contains("~$"))//跳过临时文件
                continue;
            String deptName=IOHelpers.getFileNameWithoutExtension(excelFile);//通过文件名分出部门名称
            Workbook workbook = ExcelHelpers.openFile(excelFile);//打开部门的Excel文档
            Sheet sheet=workbook.getSheetAt(0);
            int laseRowNum=sheet.getLastRowNum();
            for (int i=1;i<=laseRowNum;i++)//跳过表头
            {
                String name=ExcelHelpers.getCellStringValue(sheet,i,0);
                String phoneNum=ExcelHelpers.getCellStringValue(sheet,i,1);
                String gender=ExcelHelpers.getCellStringValue(sheet,i,2);
                //System.out.println(name+phoneNum+gender);
                //写入新的Excel文档
                ExcelHelpers.setCellValue(newsheet,rowNum,0,deptName);
                ExcelHelpers.setCellValue(newsheet,rowNum,1,name);
                ExcelHelpers.setCellValue(newsheet,rowNum,2,phoneNum);
                ExcelHelpers.setCellValue(newsheet,rowNum,3,gender);
                rowNum++;
            }
            ExcelHelpers.close(workbook);
        }
        ExcelHelpers.saveToFile(newworkbook,"d:/temp/工资条/合并.xlsx");
        ExcelHelpers.close(newworkbook);
    }
}
