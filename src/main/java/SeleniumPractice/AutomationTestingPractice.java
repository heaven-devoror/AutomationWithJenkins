package SeleniumPractice;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AutomationTestingPractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Actions action = new Actions(driver);

        /*WebElement username = driver.findElement(By.xpath("//input[@id='name']"));
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
        WebElement address = driver.findElement(By.xpath("//textarea[@id='textarea']"));

        username.sendKeys("Test User");
        email.sendKeys("testing@gmail.com");
        phone.sendKeys("1234567890");
        address.sendKeys("as;dlkfjlsjdafl;jklsajfl");

        System.out.println("User field visible : " + username.isDisplayed());
        System.out.println("Email field visible : " + email.isDisplayed());
        System.out.println("Phone field visible : " + phone.isDisplayed());
        System.out.println("Address field visible : " + address.isDisplayed());

        System.out.println("\nUser field enabled : " + username.isEnabled());
        System.out.println("Email field enabled : " + email.isEnabled());
        System.out.println("Phone field enabled : " + phone.isEnabled());
        System.out.println("Address field enabled : " + address.isEnabled());*/

        /*WebElement radioMale = driver.findElement(By.xpath("//input[@id='male']"));
        WebElement radioFemale = driver.findElement(By.xpath("//input[@id='female']"));

        WebElement checkSunday = driver.findElement(By.xpath("//input[@id='sunday']"));
        WebElement checkMonday = driver.findElement(By.xpath("//input[@id='monday']"));
        WebElement checkTuesday = driver.findElement(By.xpath("//input[@id='tuesday']"));
        WebElement checkWednesday = driver.findElement(By.xpath("//input[@id='wednesday']"));
        WebElement checkThursday = driver.findElement(By.xpath("//input[@id='thursday']"));
        WebElement checkFriday = driver.findElement(By.xpath("//input[@id='friday']"));
        WebElement checkSaturday = driver.findElement(By.xpath("//input[@id='saturday']"));

        radioMale.click();
        checkSunday.click();
        checkTuesday.click();
        checkThursday.click();
        checkFriday.click();

        System.out.println("\nMale radio button selected : " + radioMale.isSelected());
        System.out.println("Female radio button selected : " + radioFemale.isSelected());
        System.out.println("Sunday checkbox selected : " + checkSunday.isSelected());
        System.out.println("Monday checkbox selected : " + checkMonday.isSelected());*/

//        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,\"day\")]"));

        /*for(WebElement boxes : checkboxes)
        {
            boxes.click();
        }*/

        // Select any checkbox
        /*for(WebElement check : checkboxes)
        {
            String checkbox = check.getAttribute("id");
            if(checkbox.equals("monday") || checkbox.equals("friday"))
            {
                check.click();
            }
        }*/

        // Select the last 2 checkbox
        /*for(int i=checkboxes.size() - 2; i < checkboxes.size(); i++)
        {
                checkboxes.get(i).click();

        }*/

        // Select first 2 checkox
        /*for(int i=0; i<checkboxes.size() - (checkboxes.size() - 2); i++)
        {
            checkboxes.get(i).click();
        }*/

//        // Double click first box with text
//        WebElement boxWithText = driver.findElement(By.xpath("//input[@value='Hello World!']"));
//        action.moveToElement(boxWithText).doubleClick(boxWithText).perform();
//
//        // Double click second empty box
//        WebElement boxWithoutText = driver.findElement(By.xpath("//input[@id='field2']"));
//        action.moveToElement(boxWithoutText).doubleClick(boxWithoutText).perform();

//        // Double click button to copy text
//        WebElement doubleClickButton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
//        action.moveToElement(doubleClickButton).doubleClick(doubleClickButton).perform();
//
//        // Drag and drop
//        WebElement elementToDrag = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
//        WebElement elementToDrop = driver.findElement(By.xpath("//div[@id='droppable']"));
//        action.moveToElement(elementToDrag).dragAndDrop(elementToDrag, elementToDrop).perform();
//
//        // Drag the slider to end
//        WebElement sliderButton = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
//        action.moveToElement(sliderButton).dragAndDropBy(sliderButton, 340,0).perform();

        // Resize window button
        WebElement resizeButton = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
        action.moveToElement(resizeButton).dragAndDropBy(resizeButton, 500, -500).perform();
    }
}
