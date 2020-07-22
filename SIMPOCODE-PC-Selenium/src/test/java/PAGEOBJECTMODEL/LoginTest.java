package PAGEOBJECTMODEL;

import Utilities.Driver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {
    LoginPage loginPage;

    @Test
    public void loginTest01() {
        Driver.getDriver().get("https://qa2.vytrack.com");
        loginPage = new LoginPage();

        loginPage.setUserName("prependedInput");
        loginPage.setPassword("prependedInput2");
        loginPage.setLoginButton();
    }
}
