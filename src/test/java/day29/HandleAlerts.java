package day29;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;


import static java.lang.Thread.sleep;

public class HandleAlerts {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // 1) normal alert with ok button

        //driver.findElement(By.xpath ("//button[normalize-space()='Click for JS Alert']")).click();

        //Thread.sleep(2000);

        // or
        // WebDriver wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.alertIsPresent());


       // driver.switchTo().alert().accept();

        // capturing the alert msg before closing

//        Alert myAlert = driver.switchTo().alert();
//        System.out.println(myAlert.getText());
//        myAlert.accept();

        //2) confirmation alert - ok / cancel

       // driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
       // Thread.sleep(3000);

       // driver.switchTo().alert().accept();  // close alert using ok
       // driver.switchTo().alert().dismiss(); // close alert using cancel

        // prompt alert - input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
         Thread.sleep(3000);
        Alert myPromptAlert = driver.switchTo().alert();
        myPromptAlert.sendKeys("Welcome");
        myPromptAlert.accept();


    }
}