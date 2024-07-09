package day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class XPathDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");



        // xpath with single attribute

      //  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");

        // xpath with multiple attribute
       // driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");

        // xpath with and or operators

       // driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirts");

        // xpath with inner text - text()

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            //driver.findElement(By.xpath("//*[text()='MacBook']")).click();



//        boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//        System.out.println(displayStatus);
//
//        String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
//        System.out.println(value);

        // xpath with contains()
       // driver.findElement(By.xpath("input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
       // driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]").sendKeys("Tshirts");

        // chained xpath


        //div[@id='logo']/a/img
    }
}