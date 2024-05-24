package SeleniumPractice.OrangeHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class Claim {

    void start(WebDriver driver)
    {
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Go to claim module
        driver.findElement(By.xpath("//li/a/span[text()='Claim']")).click();

        // Go to employee Name
        driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")).sendKeys("John");

        // Reference ID
        driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]")).sendKeys("2023");

        // Event Name
        WebElement eventButton = driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div[1]//div[1]//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
        eventButton.click();
        List<WebElement> listEventNames = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
        for (WebElement event: listEventNames)
        {
            if (event.getText().equals("Accommodation"))
            {
                event.click();
                break;
            }
        }

        // Status
        WebElement statusButton = driver.findElement(By.xpath("//div[4]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
        statusButton.click();
        List<WebElement> statusNames = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
        for (WebElement status: statusNames)
        {
            if (status.getText().equals("Approved"))
            {
                status.click();
                break;
            }
        }

        // From Date
        WebElement fromDate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
        action.moveToElement(fromDate).click(fromDate).sendKeys(fromDate,"2022-01-01").perform();


        // To Date
        WebElement toDate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/input"));
        action.moveToElement(toDate).click(toDate).click(toDate).sendKeys(toDate, "2023-01-01").perform();

        // Include
        WebElement include = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/div[2]/i"));
        include.click();
        List<WebElement> includeNames = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
        for (WebElement y: includeNames)
        {
            if (y.getText().equals("Past Employees Only"))
            {
                y.click();
                break;
            }
        }

        // Click search button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/button[2]")).click();

        // Go to assign tab
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div[1]/button")).click();

        // Search for employee [Employee Name]
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("b");
        List<WebElement> employeeNames = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span")));
        for (WebElement z: employeeNames)
        {
            if (z.getText().contains("Ravi") || z.getText().contains("b"))
            {
                z.click();
                break;
            }
        }

        // event assign claim page
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
        List<WebElement> eventAssign = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
        for (WebElement i: eventAssign)
        {
            if (i.getText().equals("Travel Allowance"))
            {
                i.click();
                break;
            }
        }

        // currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
        List<WebElement> currency = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
        for (WebElement j: currency)
        {
            if (j.getText().equals("Indian Rupee"))
            {
                j.click();
                break;
            }
        }


        // Remarks
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/textarea")).sendKeys("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                "\n");

        // Click create claim assign page
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")).click();



        // New page open Click on expense button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/button")).click();


        // Expense Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[1]/div/div/div/div[2]/div/div/div[2]/i")).click();
        List<WebElement> expense_Type = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
        for (WebElement k: expense_Type)
        {
            if (k.getText().equals("Transport"))
            {
                k.click();
                break;
            }
        }

        // Date field
        WebElement claimDate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
        action.moveToElement(claimDate).click(claimDate).sendKeys(claimDate, "2023-12-12").perform();

        // Amount Box Click
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("2000");

        // Note
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[3]/div/div/div/div[2]/textarea")).sendKeys("\"If you've not read the books and this sounds like gibberish, don't worry.\"\n" +
                "\"I don’t believe all that gibberish\"\n" +
                "\"A strangely high proportion of the spam I receive is written in gibberish.\"\n" +
                "\"this article is complete gibberish - I don't understand a word of it\"\n");

        // Save button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[6]/div/div/div/form/div[4]/button[2]")).click();

        // Add attachment (Button click)
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[6]/div/button")).click();

        // browse file button click
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[9]/div/div/div/form/div[1]/div/div/div/div[2]/div/i")).click();

        Robot rb = null;
        try {
            rb = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        rb.delay(2000);

        StringSelection ss = new StringSelection("C:\\swsetup\\test.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        // CTRL + V
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(2000);
        // Release action
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_C);
        rb.delay(2000);
        // Press Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        // Comment Section
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[9]/div/div/div/form/div[2]/div/div/div/div[2]/textarea")).sendKeys("File Upload Successfully");

        // Save button click
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[9]/div/div/div/form/div[3]/button[2]")).click();

        // Click on the submit button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[9]/button[2]")).click();


    }
}
