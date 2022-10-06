package Part6;

import com.yzk18.commons.IOHelpers;
import com.yzk18.net.HttpSender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTest1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Desktop\\Google\\Chrome\\Application/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        /*
        driver.get("https://image.baidu.com/");
        WebElement kw =driver.findElement(By.id("kw"));//findElement如果有多个，就返回第一个，如果都没有就抛异常
        kw.sendKeys("白姨");
        WebElement s_newBtn=driver.findElement(By.className("s_newBtn"));
        s_newBtn.click();
        */
        driver.get("https://image.baidu.com/search/index?tn=baiduimage&ipn=r&ct=201326592&cl=2&lm=-1&st=-1&fm=result&fr=&sf=1&fmq=1658837529512_R&pv=&ic=0&nc=1&z=&hd=&latest=&copyright=&se=1&showtab=0&fb=0&width=&height=&face=0&istype=2&dyTabStr=&ie=utf-8&sid=&word=%E5%8E%9F%E7%A5%9E%E7%99%BD%E5%A7%A8");
        List<WebElement> imgs =driver.findElements(By.className("imgitem"));
        int i=1;//文件名计数
        for (WebElement img:imgs){
            String imgUrl=img.getAttribute("data-thumburl");
            System.out.println(imgUrl);
            String imgText=img.findElement(By.className("imgitem-title")).getText();
            imgText=imgText.replace("*","").replace("?","").replace("|","").replace("/","").replace("\\","");
//            保存图片
            byte[] bytes=new HttpSender().sendGetBytes(imgUrl);
            IOHelpers.writeAllBytes("D:\\temp\\爬虫\\图片/1/"+imgText+i+".jpeg",bytes);
            i++;
        }
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
