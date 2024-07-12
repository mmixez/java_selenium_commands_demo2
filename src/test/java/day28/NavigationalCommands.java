package day28;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import static java.lang.Thread.sleep;

public class NavigationalCommands {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        // using navigation - it also calls get method(). Navigation can take non string URL itself too
//        URL myUrl = new URL("https://demo.nopcommerce.com/");
//        driver.navigate().to(myUrl);

        driver.navigate().to ("https://demo.nopcommerce.com/");
        driver.navigate().to ("https://www.demoblaze.com/index.html");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
    }
}