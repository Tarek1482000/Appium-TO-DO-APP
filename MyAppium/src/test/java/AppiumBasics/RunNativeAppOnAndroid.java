package AppiumBasics;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class RunNativeAppOnAndroid {
    @Test
    public void OpenAppWay1() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("device","Tarek");
        caps.setCapability("APP","C:\\Users\\tarek\\Desktop\\MyAppium\\QAcart-To-Do.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wb/hub"),caps);
    }

//    public void OpenAppWay2() throws MalformedURLException {
//        File app = new File("QAcart-To-Do.apk");
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("device","Tarek");
//        caps.setCapability("APP",app.getAbsolutePath());
//        AndroidDriver driver = new AndroidDriver(new URL(" http://127.0.0.1:4723/wb/hub"),caps);
//    }

}
