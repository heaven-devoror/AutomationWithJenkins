package SeleniumPractice.DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Elements {

    public static void main(String[] args) throws InterruptedException{

        ChromeOptions opt = new ChromeOptions();
        opt.addExtensions(new File("./Extensions/AdBlockerStands.crx"));

        WebDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/elements");
        Actions action = new Actions(driver);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

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

        // Text Box
        driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Dummy@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("adsfj;asldkfj");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("tester home");
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", submitButton);
        submitButton.click();

        // Check box
        driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/div/div[1]/div[1]/ul[1]/li[2]")).click();
        WebElement selectionExpand = driver.findElement(By.xpath("//button[@title='Expand all']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", selectionExpand);
        selectionExpand.click();

        List<WebElement> checkBoxItem = driver.findElements(By.xpath("//span[@class='rct-title']"));
        for (WebElement items : checkBoxItem)
        {
            if (items.getText().equalsIgnoreCase("Desktopw") || items.getText().equalsIgnoreCase("Office"))
            {
                items.click();
            }
        }
        System.out.println("Number of items : " + checkBoxItem.size());
        Thread.sleep(2000);

        // Buttons
        driver.findElement(By.xpath("//span[normalize-space()='Buttons']")).click();
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        WebElement rightClickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        WebElement singleClickButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button"));

        action.moveToElement(doubleClickButton).doubleClick(doubleClickButton)
                .moveToElement(rightClickButton).contextClick(rightClickButton)
                .moveToElement(singleClickButton).click(singleClickButton).perform();

    }
}
