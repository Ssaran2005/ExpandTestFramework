package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class BaseTest {

    public static WebDriver driver;

    ConfigReader configReader = new ConfigReader();

    @BeforeMethod
    public void setup() {

        driver = DriverFactory.initializeDriver();

        driver.get(configReader.getBaseUrl());
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {

            driver.quit();
        }
    }
}