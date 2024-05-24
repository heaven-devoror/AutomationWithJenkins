package SeleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class day23_1Flipkart {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        WebElement searchBar = driver.findElement(By.className("Pke_EE"));
        searchBar.sendKeys("mobiles", Keys.ENTER);
//        searchBar.sendKeys(Keys.RETURN);

        // Get the current window handle
        String currentWindowHandle = driver.getWindowHandle();

        // Clicking on the third item
        driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        // Switch to the new tab
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Add to cart button click
        driver.findElement(By.xpath("//li[@class=\"col col-6-12\"]/button")).click();

        // Click Place Order
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@action=\"https://www.flipkart.com/checkout/init?view=FLIPKART&loginFlow=true\"]/button")));
        driver.findElement(By.xpath("//form[@action=\"https://www.flipkart.com/checkout/init?view=FLIPKART&loginFlow=true\"]/button")).click();

        // Click About us
        driver.findElement(By.linkText("Contact Us")).click();
    }
}
