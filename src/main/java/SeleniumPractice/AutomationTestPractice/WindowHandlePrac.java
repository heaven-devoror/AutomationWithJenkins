package SeleniumPractice.AutomationTestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WindowHandlePrac {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        WebElement searchBox = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
        searchBox.sendKeys("Selenium");

        // Click on the search box
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Capture all the links
        List<WebElement> searchLinks = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link' or @id='Wikipedia1_wikipedia-search-more']/a"));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='wikipedia-search-result-link' or @id='Wikipedia1_wikipedia-search-more']/a")));

        System.out.println("Number of links found : " + searchLinks.size());

        List<WebElement> taskSearchLinks = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
        for (WebElement x : taskSearchLinks)
        {
            x.click();
        }

        // Capture all windows ID's
        Set<String> widowIds = driver.getWindowHandles();
        System.out.println("Number of window handles : " + widowIds.size());
        // Close specific windows/tab
        for (String y : widowIds)
        {
            String tabs = driver.switchTo().window(y).getTitle();
            if (tabs.equals("Selenium dioxide - Wikipedia") || tabs.equals("Selenium - Wikipedia")) {
                driver.close();
            }
        }

    }
}
