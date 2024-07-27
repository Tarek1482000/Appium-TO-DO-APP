package AppiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {
    private AppiumDriverLocalService service;
    private AndroidDriver driver;

    @BeforeClass
    public void setUp() {
        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4725));
        service.start();
    }

    @Test
    public void OpenWebApp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        ;
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Tarek");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

//        caps.setCapability("platformName", "Android");
//        caps.setCapability("deviceName", "Tarek");
//        caps.setCapability("browserName", "chrome");

        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        caps.setCapability("chromedriverExecutable", WebDriverManager.chromedriver().getDownloadedDriverPath());

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.get("https://google.com");
    }
}
