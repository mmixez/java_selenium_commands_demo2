package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

       // driver.manage().window().maximize();

        //tag id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");

        // as tag name is optional, we can do like this

        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");

        // tag class name

      //  driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");

        // tag and attribute
       // driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");

        // tag class attribute
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");



    }
}
