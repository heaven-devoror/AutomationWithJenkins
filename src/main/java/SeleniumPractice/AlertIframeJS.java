package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AlertIframeJS {
    public static void main(String[] args) {

        ChromeOptions opt = new ChromeOptions();
        opt.addExtensions(new File("./Extensions/AdBlockerStands.crx"));

        WebDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        Set<String> winId = driver.getWindowHandles();
        List<String> windowId = new ArrayList<>(winId); // Set to List
        String parentWinId = windowId.get(0);

        for(String id : windowId)
        {
            String title = driver.switchTo().window(id).getTitle();
            if(title.equals("Thanks for installing Stands AdBlocker for Chrome - Stands Free AdBlocker"))
            {
                driver.close();
            }
        }
        driver.switchTo().window(parentWinId);

        driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();

        // Click on alert popup box
        driver.switchTo().alert().accept();

        // Change to alert OK and Cancel menu
        driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();

        // Click on cancel on alert popup box
        driver.switchTo().alert().dismiss();

        // Change to alert with text box menu
        driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();

        // Send keys to alert box and click accept
        driver.switchTo().alert().sendKeys("Agent 007");
        driver.switchTo().alert().accept();

        // Change Menu to iframe
        driver.findElement(By.xpath("//a[text()=\"SwitchTo\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Frames\"]")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='Single']/iframe")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello there I am inside frame");

        // Change to main frame
        driver.switchTo().parentFrame();

        // Change Menu to nested iframe
        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

        // Outer frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
        // Inner frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));

        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Inside nested frame :)");

        // Main frame
        driver.switchTo().parentFrame();
    }
}
