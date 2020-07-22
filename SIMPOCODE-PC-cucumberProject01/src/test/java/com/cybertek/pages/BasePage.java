package com.cybertek.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cybertek.utilities.Driver;

public abstract class BasePage {
    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
