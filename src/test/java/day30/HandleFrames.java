package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // frame 1

        driver.get("https://ui.vision/demo/webtest/frames/");
       WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");

        // frame 2

        driver.switchTo().defaultContent(); // go back to page

        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");

        driver.switchTo().defaultContent(); // go back to page

        // frame 3

        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");

        // inner frame 3
        driver.switchTo().frame(0); // switching to frame using index
       // driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();

        WebElement rdbutton = driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",rdbutton);

        driver.switchTo().defaultContent();

        // 3 types of switching
       // 1) browser windows - driver.switchTo().window(windowID/window handle)

       // 2) alerts
       // driver.switchTo().alert()
        // driver.switchTo().accept()
       // 3) frames
        // driver.switchTo().frame(id);
        // driver.switchTo().frame(name);
        // driver.switchTo().frame(WebElement);
    }
}
