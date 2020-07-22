package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MERCURY_RegistrationPage {
    //Identification WebElements on the page
    WebElement registerLink;
    public MERCURY_RegistrationPage() { PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(linkText = "REGISTER")        public WebElement RegLink;
    @FindBy(name = "firstName")           public WebElement FirstName;
    @FindBy(name = "lastName")            public WebElement LastName;
    @FindBy(name = "phone")               public WebElement phone;
    @FindBy(name = "userName")            public WebElement email;
    @FindBy(name = "address1")            public WebElement address1;
    @FindBy(name = "address2")            public WebElement address2;
    @FindBy(name = "city")                public WebElement city;
    @FindBy(name = "state")               public WebElement state;
    @FindBy(name = "postalCode")          public WebElement postalCode;
    @FindBy(name = "country")             public WebElement country;
    @FindBy(name = "email")               public WebElement username;
    @FindBy(name = "password")            public WebElement password;
    @FindBy(name = "confirmPassword")     public WebElement confirmpassword;
    @FindBy(name = "register")            public WebElement registerBtn;


    //Creating those methods
    public void clickRegLink() {RegLink.click();}
    public void setFirstName(String frstname) {FirstName.sendKeys(frstname);}
    public void setLastName(String lname) {LastName.sendKeys(lname);}
    public void setPhone(String ph) {phone.sendKeys(ph);}
    public void setEmail(String mail) {email.sendKeys(mail);}
    public void setAddress1(String addr1) {address1.sendKeys(addr1);}
    public void setAddress2(String addr2) {address2.sendKeys(addr2);}
    public void setCity(String ci) {city.sendKeys(ci);}
    public void setState(String st) {state.sendKeys(st);}
    public void setPostalCode(String pcode) {postalCode.sendKeys(pcode);}
    public void setCountry(String cn)
    {
        WebElement con = country;
        Select drop = new Select((con));
        drop.selectByVisibleText(cn);
    }
    public void setUsername(String uname) {username.sendKeys(uname);}
    public void setPassword(String passwrd) {password.sendKeys(passwrd);}
    public void setConfirmpassword(String passwrd) {confirmpassword.sendKeys(passwrd);}
    public void clickRegBtn() {registerBtn.click();}
}
