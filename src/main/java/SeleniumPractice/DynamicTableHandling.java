package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DynamicTableHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo");
        //password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
        // click login
        driver.findElement(By.xpath("//button")).click();

//        Thread.sleep(5000);
        // close pop up
        WebElement popUpClose = driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button"));
        action.moveToElement(popUpClose).click(popUpClose).perform();

        // Click on sales
        driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();

        // click on orders
        driver.findElement(By.xpath("//ul/li/a[text()='Orders']")).click();

        String pageLinks = driver.findElement(By.xpath("//div/div[2][@class='col-sm-6 text-end']")).getText();

        int pages = Integer.parseInt(pageLinks.substring(pageLinks.indexOf('(')+1, pageLinks.indexOf("Pages")-1));

        for (int i=1; i<=5; i++)
        {
            WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//li/span"));

            int numberOfItems= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
//            System.out.println("Number of Items on page " + i + " is " + numberOfItems);
            // Read all rows from each page
            for(int j=1; j<numberOfItems; j++)
            {
                // OrderID
                WebElement orderID = driver.findElement(By.xpath("//div[@class='table-responsive']//tbody/tr["+j+"]/td[2]"));
                // Customer Name
                WebElement name = driver.findElement(By.xpath("//div[@class='table-responsive']//tbody/tr["+j+"]/td[4]"));
                // Status
                WebElement status = driver.findElement(By.xpath("//div[@class='table-responsive']//tbody/tr["+j+"]/td[5]"));

                System.out.print(orderID.getText() + "       " + name.getText() + "       " + status.getText());
                System.out.println();
            }
            System.out.println("===========================================================");


//            WebElement pageLink = driver.findElement(By.xpath("//ul[@class='pagination']//li/a"));

//            driver.navigate().refresh();
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("scroll(0, 250)");

            String pageNumber = Integer.toString(i+1);
            WebElement nextPage = driver.findElement(By.xpath("//ul[@class='pagination']//li/a[text()='"+pageNumber+"']"));
            wait.until(ExpectedConditions.elementToBeClickable(nextPage));
            action.moveToElement(nextPage).click(nextPage).perform();
        }

    }
}
