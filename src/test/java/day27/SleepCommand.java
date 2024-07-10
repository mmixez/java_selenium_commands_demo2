package day27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

import static java.lang.Thread.sleep;

public class SleepCommand {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // get (url) - opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");



    }
}