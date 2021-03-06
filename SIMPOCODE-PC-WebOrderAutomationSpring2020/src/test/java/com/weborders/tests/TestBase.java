package com.weborders.tests;

import com.weborders.utilities.BrowserUtils;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    @BeforeMethod
    public void setup() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult) {

        if (iTestResult.getStatus() == iTestResult.FAILURE) {
            BrowserUtils.takeScreenshot();
        }

        Driver.closeDriver();
    }
}
