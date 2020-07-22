package WEBJAVAFAKER;


import Utilities.Driver;
import org.testng.annotations.Test;

public class SelectTask02 {
    @Test
    public void task02() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }
}
