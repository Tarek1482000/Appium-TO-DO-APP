package AppiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {
    @Test
    public void  OpenWebApp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.,"chrome");

        caps.setCapability("platformName","Android");
        caps.setCapability("device","Tarek");
        caps.setCapability("browserName","chrome");

        WebDriverManager.chromedriver().setup();
        caps.setCapability("chromedriverExecutable", WebDriverManager.chromedriver().getBrowserPath());
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.get("https://google.com");

    }
}
