package AppiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class RunNativeAppOnAndroid {
    private AppiumDriverLocalService service;
    private AndroidDriver driver;

    @BeforeClass
    public void setUp() {
        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4725));
        service.start();
    }

    @Test
    public void OpenAppWay2() throws MalformedURLException {
        File app = new File("QAcart-To-Do.apk");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("device","Tarek");
        caps.setCapability("APP",app.getAbsolutePath());
        AndroidDriver driver = new AndroidDriver(new URL(" http://127.0.0.1:4723/wd/hub"),caps);
    }

//    @Test
//    public void OpenAppWay1() throws MalformedURLException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("deviceName", "Tarek");
//        caps.setCapability("app", "C:\\Users\\tarek\\Desktop\\TestAppium\\QAcart-To-Do.apk");
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), caps);
//    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
//            driver.quit();
        }
        if (service != null) {
//            service.stop();
        }
    }
}


