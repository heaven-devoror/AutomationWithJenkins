package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FlipkartElectricBagaloo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Send text to search bar and press enter
        driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("mobiles", Keys.ENTER);

        // Click the first item
        driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]")).click();

        // Get window handles
        Set<String> winHandles = driver.getWindowHandles();
        List<String> listWinHandles = new ArrayList<>(winHandles);

        String firstWinHandle = listWinHandles.get(0);
        String secondWinHandle = listWinHandles.get(1);

        // Change the focus to second window
        driver.switchTo().window(secondWinHandle);

        // Get the Item price
        WebElement price = driver.findElement(By.cssSelector(".Nx9bqj.CxhGGd"));
        System.out.println("Item price : " + price.getText());

        // close the second browser
        driver.close();

        // Change the focus to first window
        driver.switchTo().window(firstWinHandle);

        List<WebElement> NumberOfItems = driver.findElements(By.xpath("//div[@class='cPHDOP col-12-12']//div[@class='KzDlHZ']"));
        System.out.println("Number of items : " + NumberOfItems.size());
    }
}
