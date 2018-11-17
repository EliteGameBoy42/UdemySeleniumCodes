package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Actionclass {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\eclipse-workspace\\Introduction\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/signin/v2/sl/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail&passive=1209600&sacu=1&ignoreShadow=0&hl=en&acui=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin#Email=syfulislam41@gmail.com");
        driver.findElement(By.linkText("Privacy")).click();

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());
        Thread.sleep(10000L);


        driver.quit();

    }
}
