package SeleniumPractice.OrangeHRMS;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;


public class MyInfo {

    void start(WebDriver driver) throws AWTException
    {
        personalDetails(driver);
        contactDetails(driver);
        emergencyContacts(driver);
        addDependents(driver);
    }

    void personalDetails(WebDriver driver) throws AWTException {
        Actions action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Go to MyInfo module
        driver.findElement(By.xpath("//span[text()=\"My Info\"]")).click();

        WebElement firstName = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/div/div/div/form/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));
        WebElement middleName = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/div/div/div/form/div/div/div[1]/div[1]/div[2]/div[2]"));
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        WebElement employeeID = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/div/div/div/form/div/div[1]/div[1]/div[1]/div[2]/input[1]"));
        WebElement otherID = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div"));
        WebElement driverID = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div"));
        WebElement nationality = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div"));
//        WebElement nickname = driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div//div//div//div//div[1]//div[2]//div[1]//div[1]//div[2]//input[1]"));
//        WebElement dateOfBirth = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div"));
//        WebElement SSN = driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div//div//div//div//div//div[3]//div[1]//div[1]//div[2]//input[1]"));
//        WebElement SIN = driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div//div//div//div//div//div[3]//div[2]//div[1]//div[2]//input[1]"));

//        WebElement dateGrid = driver.findElement(By.xpath("//div[@class='oxd-calendar-dates-grid']"));


        action.moveToElement(firstName)
                .click().doubleClick().click().sendKeys(firstName,"Monkey")
                .moveToElement(middleName).doubleClick().click().sendKeys(middleName, "D")
                .moveToElement(lastName).doubleClick().sendKeys(lastName, "Luffy")
                .moveToElement(employeeID).doubleClick().sendKeys("Pirate")
//                .moveToElement(nickname).click(nickname).sendKeys("Pirate King")
                .moveToElement(otherID).doubleClick().sendKeys(otherID, "007")
                .moveToElement(driverID).doubleClick().sendKeys("9211")
//                .moveToElement(SSN).click(SSN).sendKeys("123-234-5235")
//                .moveToElement(SIN).click(SIN).sendKeys("9191919191")
                .perform();

        // nationality dropdown
        nationality.click();
        List<WebElement> nationNames = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@role='listbox']/div[@role=\"option\"]")));
//        System.out.println("Number of items : " + nationNames.size());
        for(WebElement nation:nationNames)
        {
            if (nation.getText().equals("Japanese"))
            {
                nation.click();
                break;
            }
        }


        // marital status dropdown
//        wait.until(ExpectedConditions.elementToBeClickable(martialStatus));
//        WebElement martialStatus = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div"));
        WebElement martialStatus = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/div/div/div/form/div/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]"));
        martialStatus.click();
        List<WebElement> martialStatusOptions = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
        for(WebElement status:martialStatusOptions) {
            if (status.getText().equals("Other"))
            {
                status.click();
                break;
            }
        }


        // radio buttons
        WebElement rightButton = driver.findElement(By.xpath("//input[@type='radio' and @value=1]"));
        WebElement leftButton = driver.findElement(By.xpath("//input[@type='radio' and @value=2]"));


        if (rightButton.isSelected())
        {
            action.moveToElement(leftButton).click().perform();
        }
        else
        {
            action.moveToElement(rightButton).click().perform();
        }
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,250)", "");

        WebElement dob = driver.findElement(By.xpath("//label[text()='Date of Birth']/parent::div/parent::div//input[@placeholder='yyyy-dd-mm']"));
        action.moveToElement(dob).doubleClick(dob).sendKeys(dob, "2023-12-09").perform();

        // smoke radio button
//        driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();

        // click save button
        WebElement firstSaveButton = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-form-hint']/parent::div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(firstSaveButton));
        firstSaveButton.click();

        // Custom fields

        WebElement bloodType = driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
//        wait.until(ExpectedConditions.elementToBeClickable(bloodType));
        bloodType.click();
        List<WebElement> bloodGroups = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
        for (WebElement bloodTypes : bloodGroups)
        {
            if (bloodTypes.getText().equals("O+"))
            {
                bloodTypes.click();
                break;
            }
        }

        // test field
        driver.findElement(By.xpath("//div[@id='app']//div//div//div//div//div//div//div//div//div//form//div//div//div//div//div//input")).sendKeys("4321");

        // Second save button
        WebElement secondSaveButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(secondSaveButton));
        secondSaveButton.click();

        // Click on attachment button
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();

        // Click the browse button
        driver.findElement(By.xpath("//div[normalize-space()='Browse']")).click();

        // upload the file
        AdditionTools.fileUploadText();

        // Comment
        driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']")).sendKeys("File upload successfully");

        // Save button click
        driver.findElement(By.xpath("//button[2]")).click();
    }


    void contactDetails(WebDriver driver) throws AWTException {

        driver.navigate().refresh();

//        // Go to MyInfo module
//        driver.findElement(By.xpath("//span[text()=\"My Info\"]")).click();

        // Go to Contact Details module
        WebElement contactDetails = driver.findElement(By.xpath("//a[normalize-space()='Contact Details']"));

        contactDetails.click();

        // Street 1
        WebElement street1 = driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]"));
        AdditionTools.tripleClick(street1);
        street1.sendKeys("Downtown Mexico");

        // Street 2
        WebElement s2 = driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div//div//div//div//div[1]//div[1]//div[2]//div[1]//div[2]//input[1]"));
        AdditionTools.tripleClick(s2);
        s2.sendKeys("State : Pensalvania \n Country : Bulgaria");

        // City
        driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div//div//div//div//div[1]//div[1]//div[3]//div[1]//div[2]//input[1]")).sendKeys("Ghost Tower");

        // State
        driver.findElement(By.xpath("//div[4]//div[1]//div[2]//input[1]")).sendKeys("No Way Home");

        // Pincode
        driver.findElement(By.xpath("//div[5]//div[1]//div[2]//input[1]")).sendKeys("000000");

        // Country Dropdown
        driver.findElement(By.xpath("//div[@id='app']//div//div//div//div//div//div//div//div//form//div//div//div//div//div//div//div//div//i")).click();

        // Select random item from dropdownlist
        AdditionTools.dropdownItemSelection(driver);

        // Telophone number
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("1234567890");

        // Mobile number
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("9988776611");

        // personal Email
        driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[2]//input[1]")).sendKeys("zebper@yahoo.com");

        // save button click
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")).click();

        // Add attachment
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();

        // Click browse button
        driver.findElement(By.xpath("//div[normalize-space()='Browse']")).click();
        AdditionTools.fileUploadText();

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Click on the save button
        driver.findElement(By.xpath("//div[@id='app']//div//div//div//div//div//div//div//div//div//form//div//button[@type='submit'][normalize-space()='Save']")).click();
    }

    void emergencyContacts(WebDriver driver)
    {

        driver.navigate().refresh();

        // Go to emergency contacts page
        driver.findElement(By.xpath("//a[normalize-space()='Emergency Contacts']")).click();

        // Add emergency contacts
        driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/div/div/div/div/button[1]")).click();

        // Add name
        driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]")).sendKeys("Xin Zhao");

        // Relationship
        driver.findElement(By.xpath("//body//div[@id='app']//div//div//div//div//div//div//div//div//div[1]//div[1]//div[2]//div[1]//div[2]//input[1]")).sendKeys("Brother");

        // mobile number
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("98787865231");

        // Click the save button
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    }

    void addDependents(WebDriver driver)
    {
        driver.navigate().refresh();

        myInfo(driver);

        // Go to dependents page
        driver.findElement(By.xpath("//a[normalize-space()='Dependents']")).click();

        // Click on add button
        driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/div/div/div/div/button[1]")).click();

        // Add name
        driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/div/div/div/form/div/div/div/div/div/input[1]")).sendKeys("Roronoa Zoro");

        // Click on relationship button
        driver.findElement(By.xpath("//div[@id='app']//div//div//div//div//div//div//div//div//form//div//div//div//div//div//div//div//div//i")).click();
        AdditionTools.dropdownItemSelection(driver);

        WebElement relation = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]"));

        if (relation.getText().equals("Child"))
        {

        }
        else{
            driver.findElement(By.xpath("//div[3]//div[1]//div[2]//input[1]")).sendKeys("Grand child");
        }

        // Date of birth enter
        driver.findElement(By.xpath("//input[@placeholder='yyyy-dd-mm']")).click();
        driver.findElement(By.xpath("//input[@placeholder='yyyy-dd-mm']")).sendKeys("2015-13-11");

        // Click save
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

    }

    void myInfo(WebDriver driver)
    {
        // Go to MyInfo module
        driver.findElement(By.xpath("//span[text()=\"My Info\"]")).click();
    }

}
