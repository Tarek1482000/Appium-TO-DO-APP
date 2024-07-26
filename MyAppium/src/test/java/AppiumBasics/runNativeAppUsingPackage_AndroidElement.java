package AppiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class runNativeAppUsingPackage_AndroidElement {
    @Test
    public void OpenTheApp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("device","Tarek");
        caps.setCapability("appActivity","");
        caps.setCapability("appPackage","");
        AndroidDriver <AndroidElement>  driver = new AndroidDriver <AndroidElement> (new URL(" http://127.0.0.1:4723/wd/hub"),caps);
    }
}
