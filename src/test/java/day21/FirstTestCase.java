package day21;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");

        String title = "Your Store";
        String actual_title = driver.getTitle();
        if (actual_title.equals(title)) {
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }
        driver.close();
    }
}
