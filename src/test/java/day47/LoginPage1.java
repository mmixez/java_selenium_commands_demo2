package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {

    WebDriver driver;
    // constructor
    LoginPage1(WebDriver driver) {
    this.driver = driver;
    }
    // locators
    By txt_username_loc = By.xpath("//input[@placeholder='Username']");
    By txt_password_loc = By.xpath("//input[@placeholder='Password']");
    By btn_login = By.xpath("//button[normalize-space()='Login']");

    // action methods
    public void setUserNasme(String user) {
        driver.findElement(txt_username_loc).sendKeys(user);
    }

    public void setPassWord(String passWord) {
        driver.findElement(txt_password_loc).sendKeys(passWord);
    }

    public void clickLogin () {
        driver.findElement(btn_login).click();
    }

}
