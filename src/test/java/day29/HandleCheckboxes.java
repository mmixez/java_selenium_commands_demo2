package day29;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.List;


import static java.lang.Thread.sleep;

public class HandleCheckboxes {


    public static void main (String[]args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://testautomationpractice.blogspot.com/");

        //1) select specific check boxes
      //  driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2) select multiple check boxes
        List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//
//        for (int i = 0; i < checkboxes.size(); i++) {
//            checkboxes.get(i).click();
//        }
//
//        for (WebElement checkbox: checkboxes){
//            checkbox.click();
//        }

        //3) select last 3 checkboxes

            for (int i = checkboxes.size()-3; i < checkboxes.size();i++) {
             checkboxes.get(i).click();
            }

        //4) select first 3 checkboxes

            for (int i = 0 ; i < 3 ; i++) {
                checkboxes.get(i).click();
            }
        //5) unselect selected checkboxes

            for (WebElement checkbox : checkboxes) {
                if (checkbox.isSelected()) {
                    checkbox.click();
                }

            }
        }
}