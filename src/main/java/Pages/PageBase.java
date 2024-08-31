package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageBase {
    protected static AppiumDriver driver;

    public PageBase(AppiumDriver driver) {
        this.driver = driver;
    }

    /**
     * Sends text to a web element.
     * @param element The web element to send text to.
     * @param text The text to send.
     */
    public static void SendText(WebElement element, String text) {
        element.sendKeys(text);
    }

    /**
     * Clicks on a web element.
     * @param element The web element to click.
     */
    public static void Clicking(WebElement element) {
        element.click();
    }

    /**
     * Finds a web element by its locator.
     * @param locator The locator of the web element.
     * @return The found web element.
     */
    public static WebElement findElementByLocator(By locator) {
        try {
            return driver.findElement(locator);
        } catch (Exception e) {
            System.out.println("Element not found: " + locator);
            throw e;
        }
    }

    /**
     * Gets the text content of a web element.
     * @param locator The locator of the web element.
     * @return The text content of the web element.
     */
    public static String getContent(By locator) {
        return findElementByLocator(locator).getText();
    }
}
