package OpenBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class openFirefox {

    public WebDriver driver;
    String url="http://demo.guru99.com/selenium/newtours/";

    @Test
    public void openFirefox(){
        System.setProperty("webdriver.gecko.driver","..\\openBrowsers\\BrowserConfig\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);

       // driver.close();
       // driver.quit();
    }
}
