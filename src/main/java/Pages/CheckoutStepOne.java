package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOne {

    WebDriver driver;

    public CheckoutStepOne(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement enterFirstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement enterLastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement enterZipCode;

    @FindBy(xpath = "//button[@id='cancel']")
    private WebElement cancelButton;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public void setEnterFirstName()
    {
        this.enterFirstName.sendKeys("John");
    }

    public void setEnterLastName()
    {
        this.enterLastName.sendKeys("Doe");
    }

    public void setEnterZipCode()
    {
        this.enterZipCode.sendKeys("123456");
    }

    public void cancelButtonClick()
    {
        this.cancelButton.click();
    }

    public void continueButtonClick()
    {
        this.continueButton.click();
    }

    public boolean cancelButtonVisible()
    {
        return this.cancelButton.isDisplayed();
    }

    public boolean continueButtonVisible()
    {
        return this.continueButton.isDisplayed();
    }
}
