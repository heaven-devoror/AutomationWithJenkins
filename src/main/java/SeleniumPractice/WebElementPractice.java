package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.basic.BasicBorders;
import java.time.Duration;
import java.util.List;

public class WebElementPractice {
    public static void main(String[] args) {

        // 1) Total number of links
        // 2) Total number of images
        // 3) Click on any product link using link text / partial link text



        WebDriver obj = new ChromeDriver();
        obj.manage().window().maximize();
        obj.get("https://www.demoblaze.com/index.html");

        // 1) Total number of links
        List<WebElement> links = obj.findElements(By.tagName("a"));
        System.out.println("Number of links : " + links.size());

        // 2) Total number of images
        List<WebElement> images = obj.findElements(By.tagName("img"));
        System.out.println("Number of images : " + images.size());

        // Wait till object/element is loaded
        WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Samsung galaxy s7")));

        // 3) Click on any product link using link text / partial link text
        obj.findElement(By.linkText("Samsung galaxy s7")).click();
    }
}
