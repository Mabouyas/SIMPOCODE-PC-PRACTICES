package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;


public class AddCustomerPage extends BasePage {

    By LinkCustomers=By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");



    public void ClickOnCustomers() {
        Driver.getDriver().findElement((By) LinkCustomers).click();
    }
}