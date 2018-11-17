package salesforce;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;

import java.security.Key;
import java.util.Iterator;
import java.util.Set;

public class javascriptexample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\eclipse-workspace\\Introduction\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ksrtc.in/oprs-web/");

        driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return document.getElementById('fromPlaceName').value;";
        String text = (String) js.executeScript(script);
        System.out.println(text);

        int i = 0;
        while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")) {
            i++;
            driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
            text = (String) js.executeScript(script);
            System.out.println(text);
            if (i > 10) {
                break;
            }
        }
        if (i > 10) {
            System.out.println("Element no found");
        } else {
            System.out.println("Element found");
        }


    }
}
