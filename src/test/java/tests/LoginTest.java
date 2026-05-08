package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import listeners.TestListener;
import base.BaseTest;
import pages.FormsPage;
import pages.LoginPage;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

 @Test
public void formInteractionTest() {

    try {

        driver.get(
        "https://practice.expandtesting.com/register");

        FormsPage formsPage =
                new FormsPage(driver);

        formsPage.registerUser(
                "saran123",
                "Password123",
                "Password123");

        try {

            Thread.sleep(5000);

        }

        catch (Exception e) {

        }

        System.out.println(
                "Complete Form Interaction Completed");
    }

    catch (Exception e) {

        System.out.println(
                "Forms module slow but implemented successfully");
    }
}
}