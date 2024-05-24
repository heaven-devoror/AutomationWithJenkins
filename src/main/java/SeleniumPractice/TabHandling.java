package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TabHandling {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://testautomationpractice.blogspot.com/");

//        String windowTabId = driver.getWindowHandle();
//        System.out.println(windowTabId);

        driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();

        Set<String> windowTabIds = driver.getWindowHandles();
//        System.out.println(windowTabIds);

        // First method Iterator
        /*Iterator<String> id = windowTabIds.iterator();

        String parentWindowId = id.next();
        String childWindowId = id.next();

        System.out.println("Parent tab id : " + parentWindowId);
        System.out.println("Child tab id : " + childWindowId);*/

        // Second method list

        List<String> windowListId = new ArrayList<>(windowTabIds);  // Changes set to list
        /*String parentWindowId = windowListId.get(0);
        String childWindowId = windowListId.get(1);

        // Switching windows using windows id
        driver.switchTo().window(parentWindowId);
        System.out.println("Parent window title : " + driver.getTitle());

        driver.switchTo().window(childWindowId);
        System.out.println("Child window title : " + driver.getTitle());
        driver.close();*/

        /*for(String winid : windowListId)
        {
            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);
        }*/

        for(String winid : windowListId)
        {
            String title = driver.switchTo().window(winid).getTitle();
            if(title.equals("Automation Testing Practice"))
            {
                driver.close();
            }
        }

    }
}
