package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestCase {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String app)
    {
        if (browser.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        driver.get(app);
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
