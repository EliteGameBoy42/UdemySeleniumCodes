package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class salesforce {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\eclipse-workspace\\Introduction\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.rediff.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.id("login1")).sendKeys("this is a test");


    }

}

