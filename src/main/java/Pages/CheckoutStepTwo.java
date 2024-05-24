package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwo {

    WebDriver driver;

    public CheckoutStepTwo(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[normalize-space()='Payment Information:']")
    private WebElement paymentInformation;

    @FindBy(xpath = "//div[normalize-space()='Shipping Information:']")
    private WebElement shippingInformation;

    @FindBy(xpath = "//div[normalize-space()='Price Total']")
    private WebElement priceTotal;

    @FindBy(xpath = "//button[@id='cancel']")
    private WebElement cancelButton;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    public boolean paymentInformationVisible()
    {
        return this.paymentInformation.isDisplayed();
    }

    public boolean shippingInformationVisible()
    {
        return this.shippingInformation.isDisplayed();
    }

    public boolean priceTotalVisible()
    {
        return this.priceTotal.isDisplayed();
    }

    public void cancelButtonClick()
    {
        this.cancelButton.click();
    }

    public void finishButtonClick()
    {
        this.finishButton.click();
    }

    public boolean cancelButtonVisible()
    {
        return this.cancelButton.isDisplayed();
    }

    public boolean finishButtonVisible()
    {
        return this.finishButton.isDisplayed();
    }
}
