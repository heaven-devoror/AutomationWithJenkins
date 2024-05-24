package SeleniumPractice.OrangeHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.awt.*;
import java.time.Duration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {



        // Module Options
        System.out.println("Select the module : \n");
        System.out.println("1. Info");
        System.out.println("2. Performance");
        System.out.println("3. Claim");
        System.out.println("4. Buzz");

        // Enter your choice
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        WebDriver driver = new ChromeDriver();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // wait thread
//        Thread.sleep(5000);

        // Username
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

        //password
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");

        // Login button click
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        // Module Selection
        if (option == 1)
        {
            MyInfo myInfo = new MyInfo();
            myInfo.start(driver);
        } else if (option == 2) {
            Performance perform = new Performance();
            perform.start(driver);
        } else if (option == 3) {
            Claim claim = new Claim();
            claim.start(driver);
        } else if (option == 4) {
            Buzz buzz = new Buzz();
            buzz.start(driver);
        }
    }
}
