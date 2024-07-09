package day26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

import static java.lang.Thread.sleep;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // get (url) - opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);

        // getTitle() - returns the title of the page
//        String title = driver.getTitle();
//        System.out.println(title);

        // getCurrentUrl()
//        System.out.println(driver.getCurrentUrl());


        // page source

//        System.out.println(driver.getPageSource());

        //getWindowHandle()
//        String windowid = driver.getWindowHandle();
//        System.out.println(windowid);


        driver.findElement(By.linkText("OrangeHRM, Inc")).click();  // opens new browser window
        Set<String> windowids = driver.getWindowHandles();
        System.out.println(windowids);

    }
}