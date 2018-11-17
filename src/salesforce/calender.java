package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calender {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\eclipse-workspace\\Introduction\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.aa.com");
        driver.findElement(By.name("departDate")).click();

        while (!driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText().contains("June")) {
            driver.findElement(By.xpath("//a[@title='Next']")).click();
        }
        List<WebElement> novdates = driver.findElements(By.xpath("//*[@data-handler='selectDay']"));
        int novcount = driver.findElements(By.xpath("//*[@data-handler='selectDay']")).size();
        System.out.println(novcount);

        for (int i = 0; i < novcount; i++) {
            String text = driver.findElements(By.xpath("//*[@data-handler='selectDay']")).get(i).getText();
            if (text.equalsIgnoreCase("10")) {
                driver.findElements(By.xpath("//*[@data-handler='selectDay']")).get(i).click();
                break;
            }

        }

    }
}
