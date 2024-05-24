package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login{

    WebDriver driver;

    public Login(WebDriver d)
    {
        driver = d;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "user-name")
     private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    public void enterUserName()
    {
        username.sendKeys("standard_user");
    }

    public void enterPassword()
    {
        password.sendKeys("secret_sauce");
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }
}
