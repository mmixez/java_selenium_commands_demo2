package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTable {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        driver.get("https://testautomationpractice.blogspot.com/");

        // 1) find total number of rows in a table
//        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
//        System.out.println("Number of rows: " + rows);

        int rows_by_tag = driver.findElements(By.tagName("tr")).size();

        // 2) find total number of columns in a table

        int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
        // int cols = driver.findElements(By.tagName("th")).size();  // for single table

        System.out.println("Number of column is: " + cols);

        // 3) read data from specific location - 5th row & 1st column

        String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(bookName);
    }
}
