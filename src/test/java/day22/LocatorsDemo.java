package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");
       // driver.manage().window().maximize();

        //name
       // driver.findElement(By.name("search")).sendKeys("Mac");

        // id
       // boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
       // System.out.println("Is logo displayed: " + logoDisplayStatus);

        //linktext & partial linktext

       // driver.findElement(By.linkText("Tablets")).click();
        //driver.findElement(By.partialLinkText("Table")).click();

        //class
       // driver.findElements(By.className("list-inline"));

        //List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));

        //System.out.println("total number of header links: " + headerLinks.size());

        // tag

        //List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println("total number of links: " + links.size());

        // images
        List <WebElement> images = driver.findElements(By.tagName("img"));

    }
}
