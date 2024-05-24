package SeleniumPractice.OrangeHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Random;

public class AdditionTools {

    public static void fileUploadText() throws AWTException
    {
        Robot rb = new Robot();
        rb.delay(2000);

        StringSelection ss = new StringSelection("C:\\swsetup\\test.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        // CTRL + V
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(1000);
        // Release action
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_C);
        rb.delay(1000);
        // Press Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }

    public void fileUploadGIF () throws AWTException
    {
        Robot rb = new Robot();
        rb.delay(2000);

        StringSelection ss = new StringSelection("C:\\swsetup\\3b340d9327a379110d01a9bc11c8bfcfbbbcb086_640_616_1530662.gif");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        // CTRL + V
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(2000);
        // Release action
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_C);
        rb.delay(2000);
        // Press Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void dropdownItemSelection(WebDriver driver)
    {
        List<WebElement> items = driver.findElements(By.xpath("//div[@role='listbox']/div[@role=\"option\"]/span"));
        Random random = new Random();
        // get random index
        int randomIndex = random.nextInt(items.size());
        // get random item
        WebElement randomItem = items.get(randomIndex);
        randomItem.click();
    }

    public static void tripleClick(WebElement element) throws AWTException {
        Robot rb = new Robot();
        rb.delay(1000);
        rb.mouseMove(element.getLocation().x, element.getLocation().y);

        rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        rb.delay(500);

        rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
