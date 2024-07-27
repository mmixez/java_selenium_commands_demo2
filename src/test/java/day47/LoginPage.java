package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    // constructor
    LoginPage (WebDriver driver) {
        this.driver = driver;
    }
    // locators
    By txt_username = By.xpath("//input[@placeholder='Username']");
    By txt_password = By.xpath("//input[@placeholder='Password']");
    By btn_login = By.xpath("//button[normalize-space()='Login']");


    // action methods


    public void setUserName(String user) {
        driver.findElement(txt_username).sendKeys(user);

    }

    public void setTxt_password(String pwd) {
        driver.findElement(txt_password).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(btn_login).click();
    }
}
