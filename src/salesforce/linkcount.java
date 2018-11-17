package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class linkcount {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\eclipse-workspace\\Introduction\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        int linkcount = driver.findElements(By.tagName("a")).size();
        System.out.println(linkcount);
        System.out.println("Footer links count:");
        WebElement footer = driver.findElement(By.cssSelector(".navFooterLine.navFooterLinkLine.navFooterDescLine"));
        int footercount = footer.findElements(By.tagName("a")).size();

        System.out.println(footercount);

        for (int i=0;i<footercount;i++){
            String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
           footer.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);

        }
    //Switch to multiple windows and get titles of all of them
        Set<String> windows=driver.getWindowHandles();
        Iterator<String>it= windows.iterator();

        while (it.hasNext()){
           driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
        driver.quit();


        }


    }

