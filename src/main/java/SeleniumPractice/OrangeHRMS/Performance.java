package SeleniumPractice.OrangeHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Performance {

    void start(WebDriver driver)
    {
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Go to performance module
        driver.findElement(By.xpath("//span[normalize-space()='Performance']")).click();
        // Go to employee tracker
        driver.findElement(By.xpath("//a[normalize-space()='Employee Trackers']")).click();

        WebElement text = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div[2]"));

        WebElement employeeName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        employeeName.sendKeys(text.getText());
    }
}
