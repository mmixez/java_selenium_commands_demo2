package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import static java.lang.Thread.sleep;

public class HandleBrowserWindows {


        public static void main (String[]args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> windowIDs = driver.getWindowHandles();

        // approach 1
//        List<String> windowList = new ArrayList<>(windowIDs);
//        String parentID = windowList.get(0);
//        String childID = windowList.get(1);
//
//        System.out.println(driver.getTitle());
//
//        //switch to child window
//        driver.switchTo().window(childID);
//        System.out.println(driver.getTitle());
//
//
//        // approach 2
//        for (String winID: windowIDs) {
//        String title = driver.switchTo().window(winID).getTitle();
//        if (title.equals("OrangeHRM")) {
//                System.out.println(driver.getCurrentUrl());
//
//        }
//        }

        //closing specific browser window

        for (String winid:windowIDs) {
                String title = driver.switchTo().window(winid).getTitle();
                System.out.println(title);
                if (title.equals("OrangeHRM")) {
                        driver.close();
                        break;
                }
        }

    }
    }