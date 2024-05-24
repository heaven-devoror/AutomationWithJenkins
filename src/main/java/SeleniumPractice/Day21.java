package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Day21 {
    public static void main(String[] args) {

//        WebDriver driver = new EdgeDriver();
        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Input Username
        WebElement username = driver.findElement(By.id("user-name"));
//        username.click();
        username.sendKeys("standard_user");

        // Input password
        WebElement password = driver.findElement(By.id("password"));
//        password.click();
        password.sendKeys("secret_sauce");

        // Login Button Click
        WebElement buttonClick = driver.findElement(By.name("login-button"));
        buttonClick.click();

        // Check for multiple elements using class name
        List<WebElement> items = driver.findElements(By.className("inventory_item"));
        System.out.println("Number of Items : " + items.size());

        // Check for multiple elements using tag name
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of Pictures : " + links.size());

        // Check for multiple elements using tag name
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Number of Pictures : " + images.size());
    }
}
