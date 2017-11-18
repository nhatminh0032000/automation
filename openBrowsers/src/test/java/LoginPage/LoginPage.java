package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
    public static void main(String[] args){
        WebDriver driver;
        String utl="http://google.com";

        
        driver = new FirefoxDriver();

        driver.get("google.com");
        //Close: only close a single window
        driver.close();
        //quit: will close all window
        driver.quit();

    }
}
