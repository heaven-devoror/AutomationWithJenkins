package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonElements {

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartLink;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement hamburgerButton;

    public void shoppingCartLinkClick()
    {
        this.shoppingCartLink.click();
    }

    public boolean hamburgerButtonVisible()
    {
        return this.hamburgerButton.isDisplayed();
    }

    public void hamburgerButtonClick()
    {
        this.hamburgerButton.click();
    }
}
