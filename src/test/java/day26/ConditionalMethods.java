package day26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

import static java.lang.Thread.sleep;

public class ConditionalMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // get (url) - opens the url on the browser
        driver.get("https://demo.nopcommerce.com/register");

        Thread.sleep(5000);

        // isDisplayed()
//
//        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//        boolean logoStatus = logo.isDisplayed();
//        System.out.println(logoStatus);

        // shorter way
      //  boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();

        // isEnabled()

       // boolean firstNamestatus = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();

        //isSelected
//        WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
//        WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
//
//        System.out.println("Before selection....");
//        System.out.println(male_rd.isSelected());
//        System.out.println(female_rd.isSelected());
//
//        System.out.println("After selecting male...");
//        male_rd.click();
//        System.out.println(male_rd.isSelected());
//        System.out.println(female_rd.isSelected());


        boolean newsletterStatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
        System.out.println("News letter checkbox status: " + newsletterStatus);


    }


}