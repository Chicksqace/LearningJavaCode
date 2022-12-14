package Part6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ChanDanCi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Desktop\\Google\\Chrome\\Application/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        String s="driver";
        driver.get("https://bdc2.youzack.com/Recitation/Home");
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys(s);
        searchInput.sendKeys(Keys.ENTER);//回车
        WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(2));
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("weui-half-screen-dialog__bd")));//元素可见的时候在往下走
        WebElement dialog= driver.findElement(By.className("weui-half-screen-dialog__bd"));
        String txt=dialog.getText();
        System.out.println(txt);
        WebElement webElement=tryFindElement(driver,By.id("id1"));
        System.out.println(webElement);
    }
    static WebElement tryFindElement(ChromeDriver driver,By by){
        List<WebElement> elements=driver.findElements(by);
        if (elements.size()>=1){
            return elements.get(0);
        }
        else {
            return null;
        }
    }
}
