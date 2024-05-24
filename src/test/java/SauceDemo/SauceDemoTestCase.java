package SauceDemo;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SauceDemoTestCase {

    WebDriver driver;
    @BeforeClass
    public void initBrowser()
    {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void login()
    {
        Login login = new Login(driver);
        login.enterUserName();
        login.enterPassword();
        login.clickLoginButton();
    }

    @Test(priority = 2)
    public void inventory()
    {
        Inventory inventory = new Inventory(driver);
        Assert.assertEquals(inventory.totalElementsInPage(),6);
        Assert.assertTrue(inventory.cartIconVisible());
        Assert.assertTrue(inventory.addToCartItemButtonVisible());
        inventory.addToCartItemButtonClick();
        Assert.assertTrue(inventory.removeFromCartItemButtonVisible());
        inventory.shoppingCartLinkClick();
    }

    @Test(priority = 3)
    public void cart()
    {
        Cart cart = new Cart(driver);
        Assert.assertTrue(cart.checkoutButton());
        Assert.assertTrue(cart.hamburgerButtonVisible());
        Assert.assertTrue(cart.continueShoppingButton());
        cart.checkoutButtonClick();
    }

    @Test(priority = 4)
    public void checkoutStepOne()
    {
        CheckoutStepOne checkoutStepOne = new CheckoutStepOne(driver);
        Assert.assertTrue(checkoutStepOne.continueButtonVisible());
        Assert.assertTrue(checkoutStepOne.cancelButtonVisible());
        checkoutStepOne.setEnterFirstName();
        checkoutStepOne.setEnterLastName();
        checkoutStepOne.setEnterZipCode();
        checkoutStepOne.continueButtonClick();
    }

    @Test(priority = 5)
    public void checkoutStepTwo()
    {
        CheckoutStepTwo checkoutStepTwo = new CheckoutStepTwo(driver);
        Assert.assertTrue(checkoutStepTwo.paymentInformationVisible());
        Assert.assertTrue(checkoutStepTwo.shippingInformationVisible());
        Assert.assertTrue(checkoutStepTwo.priceTotalVisible());
        Assert.assertTrue(checkoutStepTwo.cancelButtonVisible());
        Assert.assertTrue(checkoutStepTwo.finishButtonVisible());
        checkoutStepTwo.finishButtonClick();
    }

    @Test(priority = 6)
    public void checkoutComplete()
    {
        CheckoutComplete checkoutComplete = new CheckoutComplete(driver);
        Assert.assertTrue(checkoutComplete.backToHomeButtonVisible());
        checkoutComplete.backToHomeButtonClick();
    }

    @Test(priority = 7)
    public void about()
    {
        About  about = new About(driver);
        Assert.assertTrue(about.hamburgerButtonVisible());
        about.hamburgerButtonClick();
        about.aboutPageLinkClick();
    }

}
