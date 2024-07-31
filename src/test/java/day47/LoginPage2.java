package day47;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

    WebDriver driver;
    // constructor
    LoginPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    // locators
@FindBy(xpath="//input[@placeholder='Username']")
    WebElement txt_username;

@FindBy(xpath="//input[@placeholder='Password']")
    WebElement txt_password;

@FindBy(xpath="//button[normalize-space()='Login']")
    WebElement btn_login;


    // action methods
    public void setUserName(String user) {
       txt_username.sendKeys(user);
    }

    public void setPassWord(String passWord) {
        txt_password.sendKeys(passWord);
    }

//    public void clickLogin () {
//        driver.findElement(btn_login).click();
//    }

}
