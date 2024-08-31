package AppiumTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class TestingEnv {

    public AppiumDriver driver;

    @Test
    public void OpenApp() throws MalformedURLException {
        // URL of the Appium server
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        // Path to the APK file
        String path = System.getProperty("user.dir") + "/APP/QAcart-To-Do.apk";

        // Set UiAutomator2Options for Android
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554"); // Ensure the emulator name is correct and running
        options.setPlatformVersion("10");
        options.setAutomationName("UiAutomator2");

        // Set the path to the app (.apk file)
        options.setApp(path);

        // Automatically grant permissions
        options.setAutoGrantPermissions(true);

        // Initialize the driver with the specified options
        driver = new AndroidDriver(url, options);

        // Add a sample interaction or validation to ensure the app is opened
        System.out.println("App has been launched successfully!");
    }
}
