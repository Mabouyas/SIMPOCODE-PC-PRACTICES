package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() { PageFactory.initElements(Driver.getDriver(),this); }


    @FindBy(id="prependedInput") public WebElement UserName;
    @FindBy(id="prependedInput2") public WebElement Password;
    @FindBy(id = "_submit") public WebElement LoginButton;


    public void setUserName(String usName) {UserName.sendKeys(usName);}
    public  void setPassword(String psWord) {Password.sendKeys(psWord);}
    public void setLoginButton() {LoginButton.click();}


}
