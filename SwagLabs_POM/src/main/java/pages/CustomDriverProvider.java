package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.webdriver.DriverSource;

public class CustomDriverProvider implements DriverSource {

    @Override
    public WebDriver newDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        return new ChromeDriver(); 
    }

    @Override
    public boolean takesScreenshots() {
        return true; 
    }
}