package Part4;

import com.yzk18.commons.DesktopHelpers;
import com.yzk18.docs.ChartFromArrayBuilder;
import com.yzk18.docs.ExcelHelpers;
import org.apache.poi.xddf.usermodel.chart.ChartTypes;
import org.apache.poi.xddf.usermodel.chart.LegendPosition;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ChartTest1 {
    public static void main(String[] args) {
        XSSFWorkbook wb = ExcelHelpers.createXLSX();
        XSSFSheet sheet=wb.createSheet();
        XSSFChart chart = ExcelHelpers.createChart(sheet, 0, 0, 10, 20);//指定坐标
        ChartFromArrayBuilder<Double> chartBuilder=new ChartFromArrayBuilder<>(ChartTypes.LINE);//类型
        chart.setTitleText("月报表");//标题
        //chart.getOrAddLegend().setPosition(LegendPosition.RIGHT);
        String[] names=new String[]{"一月份","二月份","三月份"};
        Double[] sales1=new  Double[]{3.0,5.0,9.0};
        Double[] sales2=new Double[]{3.2,2.4,12.0};
        chartBuilder.setCategoryNames(names);//横坐标
        chartBuilder.putValues("张三",sales1);//指定数据
        chartBuilder.putValues("李四",sales2);
        chartBuilder.setCategoryAxisTitle("销售额");//指定横纵坐标标题
        chartBuilder.setValueAxisTitle("月份");
        chartBuilder.build(chart);//填充到chart中
        //chartBuilder.putValues()


        ExcelHelpers.saveToFile(wb,"d:/temp/wb.xlsx");
        ExcelHelpers.close(wb);
        DesktopHelpers.openFile("d:/temp/wb.xlsx");
    }
}
