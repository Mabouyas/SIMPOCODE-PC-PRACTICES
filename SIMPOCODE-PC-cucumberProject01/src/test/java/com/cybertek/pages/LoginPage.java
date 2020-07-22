package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(id = "Email")
    private WebElement textEmail;

    @FindBy(id = "Password")
    private WebElement textPassword;

    @FindBy(xpath ="//input[@value='Log in']" )
    private WebElement btnLogin;

    @FindBy(linkText = "Logout")
    private WebElement linkLogout;

    public void setUserName(String unName) {
        textEmail.clear();
        wait.until(ExpectedConditions.visibilityOf(textEmail)).sendKeys(unName);
    }

    public void setPassword(String pwd) {
        textPassword.clear();
        wait.until(ExpectedConditions.visibilityOf(textPassword)).sendKeys(pwd);
    }

    public void clickLogin() {btnLogin.click();}

    public void clickLogout() {linkLogout.click();}

}
