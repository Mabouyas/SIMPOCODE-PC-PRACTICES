package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;




public class Steps {
    LoginPage lp = new LoginPage();

    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("User opens URL {string}")
    public void user_opens_url(String string) {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
    }

    @When("User enter Email as {string} and Password as {string}")
    public void user_enter_email_as_and_password_as(String email, String Password) {

        lp.setUserName(email);
        lp.setPassword(Password);
    }

    @When("Click on Login")
    public void click_on_login() {
        lp.clickLogin();

    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String title)
    {
        if (Driver.getDriver().getPageSource().contains("Login was unsuccessful."))
        {
            Driver.getDriver().close();
            Assert.assertTrue(false);
        }
        else
        { Assert.assertEquals(title, Driver.getDriver().getTitle()); }

    }

    @When("User Click on log out link")
    public void user_click_on_log_out_link() {
        lp.clickLogout();

    }

    @Then("close browser")
    public void close_browser() {
        Driver.getDriver().close();
    }


}
