package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver = null;
    @BeforeClass
    public void asInit() {
        System.setProperty("webdriver.chrome.driver", "/Users/anharuzzaman/Desktop/SeleniumLearning/Driver/chromedriver 2");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void init() {
        driver.get("https://www.twitter.com");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
