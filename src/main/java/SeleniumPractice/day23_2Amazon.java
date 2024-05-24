package SeleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class day23_2Amazon {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        // Go to search bar and search for Laptops
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops", Keys.ENTER);

        List<WebElement> numberOfLaptops = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));

//        List<WebElement> numberOfLaptops = driver.findElements(By.xpath("//span[contains(text(),'Laptop')]"));

//        System.out.println("Number of Laptops : " + numberOfLaptops.size());
        int count = 0;
        for(WebElement x: numberOfLaptops){
//            System.out.println(x.getText() + '\n');
            if(x.getText().contains("Laptop") || x.getText().contains("Gen") || x.getText().contains("MacBook"))
            {
                count++;
            }
        }

        System.out.println("Number of Laptops : " + count);

        for(WebElement x: numberOfLaptops){
            if(!(x.getText().contains("Laptop") || x.getText().contains("Gen") || x.getText().contains("MacBook")))
            {
                System.out.println(x.getText() + '\n');
            }
        }

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0, document.body.scrollHeight)");

        boolean visibility =  driver.findElement(By.xpath("//a[@id=\"icp-touch-link-country\"]")).isDisplayed();
        System.out.println("Is country icon visible : " + visibility);
//        driver.quit();
    }
}
