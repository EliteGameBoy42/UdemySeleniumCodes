package Facebook;

import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\eclipse-workspace\\Introduction\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Syful");
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("syful");

        Select s1 = new Select(driver.findElement(By.cssSelector("#month")));
        Select s2 = new Select(driver.findElement(By.cssSelector("#day")));
        Select s3 = new Select(driver.findElement(By.cssSelector("#year")));
        s1.selectByIndex(4);
        s2.selectByValue("20");
        s3.selectByVisibleText("1996");

        Actions ac = new Actions(driver);

        int ele = driver.findElements(By.tagName("iframe")).size();
        System.out.println(ele);
        WebDriverWait wait=new WebDriverWait(driver, 5);

        






    }


}