import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver driver;

    @BeforeClass
    void initializeBrowser(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    void launchBrowser(){
      driver.get("https://trailhead.salesforce.com/en");
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
