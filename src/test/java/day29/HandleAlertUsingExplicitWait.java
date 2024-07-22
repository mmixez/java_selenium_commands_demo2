package day29;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlertUsingExplicitWait {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(5)); // explicit wait

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));

        Alert myAlert = myWait.until(ExpectedConditions.alertIsPresent());
        myAlert.accept();


    }
}
