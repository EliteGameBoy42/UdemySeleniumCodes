package salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class sslcertification {
    public static void main(String[] args) {
        DesiredCapabilities ch = DesiredCapabilities.chrome();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        ch.acceptInsecureCerts();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(ch);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syful\\eclipse-workspace\\Introduction\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOptions);


    }
}
