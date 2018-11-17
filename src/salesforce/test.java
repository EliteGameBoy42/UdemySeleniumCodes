package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\eclipse-workspace\\Introduction\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        System.out.println(driver.findElements(By.tagName("iframe")).size());
        WebElement frame=driver.findElement(By.xpath("//*[@id='content']/iframe"));
        driver.switchTo().frame(frame);

        Actions ac = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        ac.dragAndDrop(source, target).build().perform();
    }
}
