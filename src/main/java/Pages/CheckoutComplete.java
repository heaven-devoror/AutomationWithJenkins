package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComplete {

    WebDriver driver;

    public CheckoutComplete(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement backToHomeButton;

    public boolean backToHomeButtonVisible()
    {
        return this.backToHomeButton.isDisplayed();
    }

    public void backToHomeButtonClick()
    {
        this.backToHomeButton.click();
    }
}
