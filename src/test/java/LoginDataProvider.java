package dataproviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][] {

                {"practice",
                 "SuperSecretPassword!"},

                {"wrongUser",
                 "wrongPassword"}
        };
    }
}