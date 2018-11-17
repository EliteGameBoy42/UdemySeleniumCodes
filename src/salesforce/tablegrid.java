package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;

public class tablegrid {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\eclipse-workspace\\Introduction\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20776/ban-vs-zim-2nd-test-zimbabwe-tour-of-bangladesh-2018");
        //parent to child example
        WebElement table = driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowcount = table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        int count = table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        int sum=0;
        for (int i = 0; i < count-2; i++) {
            String numbers = table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
//            System.out.println(numbers);
           int value= Integer.parseInt(numbers);
           sum=sum+value;
        }
        //sibling to sibling xpath example
        String ex=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extra=Integer.parseInt(ex);
        String tot=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        sum=sum+extra;
       int total= Integer.parseInt(tot);
        System.out.println(sum);
        System.out.println(total);
       if (sum==total){
           System.out.println("The score is matching");
       }else {
           System.out.println("The score is not matching");
       }


    }
}
