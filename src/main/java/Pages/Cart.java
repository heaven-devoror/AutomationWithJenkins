package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends CommonElements{

    WebDriver driver;

    public Cart(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;



    @FindBy(xpath = "//button[@id='continue-shopping']")
    private WebElement continueShoppingButton;



    public boolean checkoutButton()
    {
       return this.checkoutButton.isDisplayed();
    }



    public boolean continueShoppingButton()
    {
        return this.continueShoppingButton.isDisplayed();
    }

    public void checkoutButtonClick()
    {
        this.checkoutButton.click();
    }

    public void ContinueShoppingButtonClick()
    {
        this.continueShoppingButton.click();
    }

}
