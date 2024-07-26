package AppiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class runNativeAppUsingPackage {
    private AppiumDriverLocalService service;
    private AndroidDriver driver;

    @BeforeClass
    public void setUp() {
        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4725));
        service.start();
    }

    @Test
    public void OpenTheApp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Tarek");  // Corrected key to "deviceName"
        caps.setCapability("appActivity", "your.app.activity");  // Specify the main activity of your app
        caps.setCapability("appPackage", "your.app.package");  // Specify the package name of your app
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }
}
