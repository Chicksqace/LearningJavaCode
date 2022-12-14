package Part4;

import com.yzk18.docs.ExcelHelpers;
import com.yzk18.net.MailSender;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;

public class 计算个税并发送邮件1 {
    public static void main(String[] args) {
        java.text.DecimalFormat df=new java.text.DecimalFormat("#.##");
        Workbook wb = ExcelHelpers.openFile("d:/temp/2020年4月份工资表.xlsx");
        Sheet sheet=wb.getSheetAt(0);
        //for (int i=1;i<=sheet.getLastRowNum()-2;i++)
        for (int i=1;i<=sheet.getLastRowNum();i++)
        {
            String 邮箱=null;
            String 姓名=ExcelHelpers.getCellStringValue(sheet,i,0);
            String 部门=ExcelHelpers.getCellStringValue(sheet,i,1);
            //遇到员工数据行结束,就break
            if (姓名==null||姓名.equals(""))
            {
                break;
            }
            //读取邮箱
            Workbook wb员工 = ExcelHelpers.openFile("d:/temp/员工信息表.xlsx");
            Sheet sheet部门 = wb员工.getSheet(部门);//找到员工信心表中这个部门的sheet
            //遍历员工信息表的部门sheet，找到员工的一行
            for(int row员工=1;row员工<=sheet部门.getLastRowNum();row员工++)
            {
                String row姓名= ExcelHelpers.getCellStringValue(sheet部门,row员工,0);
                if(row姓名.equals(姓名))
                {
                    邮箱 = ExcelHelpers.getCellStringValue(sheet部门,row员工,3);
                    //String 邮箱 = ExcelHelpers.getCellStringValue(sheet部门,row员工,3);
                    //System.out.println(姓名+","+邮箱);
                }
            }
            if (邮箱==null)
            {
                throw new RuntimeException("找不到员工"+姓名+"的邮箱");
            }
            ExcelHelpers.close(wb员工);
            //System.out.println(姓名);

            double 基本工资=ExcelHelpers.getCellDoubleValue(sheet,i,2);
            double 绩效工资=ExcelHelpers.getCellDoubleValue(sheet,i,3);
            double 奖金=ExcelHelpers.getCellDoubleValue(sheet,i,4);
            Double 考勤罚款=ExcelHelpers.getCellDoubleValue(sheet,i,5);
            if (考勤罚款==null)
            {
                考勤罚款=0.0;
            }
            double 社保=ExcelHelpers.getCellDoubleValue(sheet,i,6);
            //应纳税所得额=基本工资+绩效工资+奖金+考勤罚款+社保-5000
            //个税=应纳税所得额*税率-速算扣除数
            double 应纳税所得额 = 基本工资+绩效工资+奖金+考勤罚款+社保-5000;
            double 税率;
            double 速算扣除数;
            if(应纳税所得额<=3000)
            {
                税率=0.03;
                速算扣除数=0;
            }
            else if(应纳税所得额>3000 && 应纳税所得额<=12000)
            {
                税率=0.1;
                速算扣除数=210;
            }
            //if(12000<应纳税所得额<=25000)
            else if(应纳税所得额>12000 && 应纳税所得额<=25000)
            {
                税率=0.2;
                速算扣除数=1410;
            }
            else if(应纳税所得额>25000 && 应纳税所得额 <=35000)
            {
                税率=0.25;	速算扣除数=2660;
            }
            else if(应纳税所得额>35000 &&  应纳税所得额<=55000)
            {
                税率=0.3;		速算扣除数=4410;
            }
            else if(应纳税所得额>55000 && 应纳税所得额<=80000)
            {
                税率=0.35;	速算扣除数=7160;
            }
            else
            {
                税率=0.45;	速算扣除数=15160;
            }
            double 个税=-(应纳税所得额*税率-速算扣除数);
            ExcelHelpers.setCellValue(sheet,i,7,个税);
            //System.out.println(基本工资+","+个税);
            double 实发工资 = 基本工资+绩效工资+奖金+考勤罚款+社保+个税;
            String text = 姓名+"你好，您的本月基本工资："+df.format(基本工资)+"，绩效工资:"+
                    df.format(绩效工资)+"，奖金:"+df.format(奖金)+"，考勤罚款："+
                    df.format(考勤罚款)+"，社保:"+df.format(社保)+"，个税："+
                    df.format(个税)+"，实发工资："+df.format(实发工资);
            System.out.println(text);
            MailSender mailSender=new MailSender();
            mailSender.setHostName("smtp.126.com");//smtp的地址
            mailSender.setUserName("cpy021115958667454@126.com");//smtp用户名
            mailSender.setPassword("NJYEBWCVIRSKIKVQ");//授权码
            mailSender.setFrom("cpy021115958667454@126.com");//发送者邮箱
            //mailSender.addTo("3473802279@qq.com");//发送给谁的邮箱
            //mailSender.setSubject("这是明天出差人员的注意事项");//标题
            //mailSender.setTextMessage("在附件中");//设置正文
            //mailSender.addAttachment(new File("D:\\temp/报表.docx"));//设置附件
            mailSender.addTo(邮箱);
            mailSender.setSubject(姓名+"的本月工资条");
            mailSender.setTextMessage(text);
            mailSender.send();
        }
        ExcelHelpers.saveToFile(wb,"d:/temp/2020年4月份工资表-算完个税.xlsx");
        ExcelHelpers.close(wb);
    }
}
