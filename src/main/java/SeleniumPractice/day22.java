package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class day22 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Username field
        driver.findElement(By.xpath(".//input[@id=\"user-name\"]")).sendKeys("standard_user");

        // Password field
        driver.findElement(By.xpath(".//input[@id=\"password\"]")).sendKeys("secret_sauce");

        // Login button click
        driver.findElement(By.xpath(".//input[@type=\"submit\"]")).click();

        // Item button click/ add to cart
        driver.findElement(By.xpath(".//button[@name=\"add-to-cart-sauce-labs-bike-light\"]")).click();

        // Cart button/link click
        driver.findElement(By.xpath(".//a[@class=\"shopping_cart_link\"]")).click();

        // Remove item from cart
        driver.findElement(By.xpath(".//button[@id=\"remove-sauce-labs-bike-light\"]")).click();

        // Go to homepage
        driver.findElement(By.xpath(".//button[@name=\"continue-shopping\"]")).click();

        // Click on the hamburger button
        driver.findElement(By.xpath(".//button[@id=\"react-burger-menu-btn\"]")).click();

        // Wait for element to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id=\"logout_sidebar_link\"]")));

        // Click on the logout button
        driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
    }
}
