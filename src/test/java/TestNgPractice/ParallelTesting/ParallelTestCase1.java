package TestNgPractice.ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTestCase1 {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Test
    void logoTest() throws InterruptedException
    {
        driver.set(new ChromeDriver());
        driver.get().get("https://demo.opencart.com/admin/index.php");
//        Thread.sleep(4000);
        WebElement logo = driver.get().findElement(By.xpath("//div[@class='card-header']//i[@class='fas fa-lock']"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    void titleTest() throws InterruptedException
    {
        driver.set(new ChromeDriver());
        driver.get().get("https://demo.opencart.com/admin/index.php");
//        Thread.sleep(4000);
        String title = driver.get().getTitle();
        Assert.assertEquals(title, "Administration");
    }

    @AfterMethod
    void tearDown()
    {
        driver.get().quit();
    }
}
