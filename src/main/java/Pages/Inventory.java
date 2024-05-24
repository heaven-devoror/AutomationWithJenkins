package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Inventory extends CommonElements{

    WebDriver driver;

    public Inventory(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class='inventory_list']//div[@class='inventory_item']")
    private List<WebElement> totalItems;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement cartIcon;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartItemBackPackButton;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement removeFromCartItemBackPackButton;


    public int totalElementsInPage()
    {
        return this.totalItems.size();
    }

    public boolean cartIconVisible()
    {
        return this.cartIcon.isDisplayed();
    }

    public boolean addToCartItemButtonVisible()
    {
        return this.addToCartItemBackPackButton.isDisplayed();
    }

    public void addToCartItemButtonClick()
    {
        this.addToCartItemBackPackButton.click();
    }

    public boolean removeFromCartItemButtonVisible()
    {
        return this.removeFromCartItemBackPackButton.isDisplayed();
    }


    public void removeFromCartItemBackPackButtonClick()
    {
        this.removeFromCartItemBackPackButton.click();
    }


}
