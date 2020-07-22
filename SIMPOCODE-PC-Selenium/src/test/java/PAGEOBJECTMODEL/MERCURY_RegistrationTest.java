package PAGEOBJECTMODEL;

import Utilities.Driver;
import org.testng.annotations.Test;
import pages.MERCURY_RegistrationPage;

public class MERCURY_RegistrationTest {

    @Test
    public void verifyFlightReg() {
        Driver.getDriver().get("http://newtours.demoaut.com");

        MERCURY_RegistrationPage RGPage = new MERCURY_RegistrationPage();

        RGPage.clickRegLink();
        RGPage.setFirstName("Jean Michel");
        RGPage.setLastName("Chauvet");
        RGPage.setPhone("7033375119");
    }
}
