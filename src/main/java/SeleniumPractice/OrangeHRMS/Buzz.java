package SeleniumPractice.OrangeHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class Buzz {

    void start(WebDriver driver) throws InterruptedException {
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Go to buzz module page
        driver.findElement(By.xpath("//li/a/span[text()='Buzz']")).click();

        // Post nonsense text
//        WebElement text = driver.findElement((By.xpath("//textarea")));

        // Click Post Button
//        WebElement postButton = driver.findElement(By.xpath("//button[@type='submit']"));

//        wait.until(ExpectedConditions.elementToBeClickable(postButton));
//        postButton.click();

        // Click Share Photos
        WebElement sharePhotos = driver.findElement(By.xpath("//button[normalize-space()='Share Photos']"));
//        wait.until(ExpectedConditions.elementToBeClickable(sharePhotos));

        action.click(sharePhotos).perform();

        // Share the description
       WebElement description = driver.findElement(By.xpath("//div[@role='document']//form//div//div//div//textarea[@placeholder=\"What's on your mind?\"]"));
        description.sendKeys("test");
       WebElement imageUpload = driver.findElement(By.xpath("//p[normalize-space()='Add Photos']"));
//       wait.until(ExpectedConditions.elementToBeClickable(imageUpload));
//       imageUpload.click();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", imageUpload);




        Robot rb = null;
        try {
            rb = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        rb.delay(2000);

        StringSelection ss = new StringSelection("C:\\swsetup\\3b340d9327a379110d01a9bc11c8bfcfbbbcb086_640_616_1530662.gif");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        // CTRL + V
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(1000);
        // Release action
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_C);
        rb.delay(1000);
        // Press Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        rb.delay(1000);

        Thread.sleep(2000);
        // Share the photo
        driver.findElement(By.xpath("//button[normalize-space()='Share']")).click();
    }
}
