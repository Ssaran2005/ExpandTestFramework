package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import utils.ConfigReader;

public class BaseTest {

    public static WebDriver driver;

    ConfigReader configReader = new ConfigReader();

    @BeforeMethod
public void setup() {

    driver = DriverFactory.initializeDriver();

    driver.manage().timeouts().implicitlyWait(
            Duration.ofSeconds(5));

    driver.manage().timeouts().pageLoadTimeout(
            Duration.ofSeconds(20));

   
}

    @AfterMethod
    public void tearDown() {

        if (driver != null) {

            driver.quit();
        }
    }
}