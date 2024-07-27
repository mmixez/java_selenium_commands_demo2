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
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
//        System.out.println("Number of rows: " + rows);

        int rows_by_tag = driver.findElements(By.tagName("tr")).size();

        // 2) find total number of columns in a table

        int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
        // int cols = driver.findElements(By.tagName("th")).size();  // for single table

     //   System.out.println("Number of column is: " + cols);

        // 3) read data from specific location - 5th row & 1st column

      //  String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
       // System.out.println(bookName);

        // 4) read data from all the rows and columns
//
//        for (int r = 2; r <= rows; r++ ) {
//            for (int c= 1; c<=cols;c++) {
//                String values = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//                System.out.println(values + "\t");
//            }
//
//        }

        // 5) print books by author name

//        for (int r=2; r< rows; r++) {
//            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//
//            if (authorName.equals("Mukesh")) {
//                String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//                System.out.println(bookname);
//            }
//
//        }

        //6 find total price of all the books
        int total = 0;
        for (int r=2; r<= rows; r++) {
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            total += Integer.parseInt(price);


        }
        System.out.println("Total price: " + total );
    }
}
