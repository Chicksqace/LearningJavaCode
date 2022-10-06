package Part7;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
public class CompanyTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Desktop\\Google\\Chrome\\Application/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://aiqicha.baidu.com/company_detail_29818658040304");
        WebElement tel=driver.findElement(By.xpath("//span[text()='电话：']/following-sibling::*[1]"));
        System.out.println(tel.getText());
    }
}
