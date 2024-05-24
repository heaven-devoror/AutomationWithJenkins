package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionTestCase {
    WebDriver driver;

    @BeforeClass
    void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    void logo() throws InterruptedException {
        Thread.sleep(4000);
        WebElement logCheck = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logCheck.isDisplayed(), "Logo is not displayed");
    }

    @Test
    void title()
    {
        String  title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
