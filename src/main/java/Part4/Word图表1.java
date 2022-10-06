package Part4;

import com.yzk18.commons.DesktopHelpers;
import com.yzk18.docs.ChartFromArrayBuilder;
import com.yzk18.docs.WordHelpers;
import org.apache.poi.xddf.usermodel.chart.ChartTypes;
import org.apache.poi.xwpf.usermodel.XWPFChart;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class Word图表1 {
    public static void main(String[] args) {
        String[] names=new String[]{"一月份","二月份","三月份"};
        Double[] sales1=new  Double[]{3.0,5.0,9.0};
        Double[] sales2=new Double[]{3.2,2.4,12.0};
        XWPFDocument doc = WordHelpers.createDocxDocument();
        XWPFChart chart = WordHelpers.createChart(doc, 400, 300);

        ChartFromArrayBuilder<Double>chartBulider=new ChartFromArrayBuilder<>(ChartTypes.LINE);
        chartBulider.setCategoryNames(names);
        chartBulider.putValues("张三",sales1);
        chartBulider.putValues("李四",sales2);
        chartBulider.setCategoryAxisTitle("月份");
        chartBulider.setValueAxisTitle("销售额");
        chartBulider.build(chart);
        WordHelpers.saveToFile(doc,"d:/temp/wordchart.docx");
        DesktopHelpers.openFile("d:/temp/wordchart.docx");

    }
}
