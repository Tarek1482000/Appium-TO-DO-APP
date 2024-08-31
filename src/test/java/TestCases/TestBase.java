package TestCases;

import Pages.LoginPage;
import Pages.SignUpPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public static Properties prop;

    protected static AppiumDriver driver;
    protected static LoginPage loginPage;
    protected static SignUpPage signUpPage;

    protected static String full_name;
    protected static String email;
    protected static String password;


    protected static String sessionUrl;
    protected static String platformName;
    protected static String platformVersion;
    protected static String deviceName;
    protected static String appPath;

    @BeforeTest
    public void setup() throws IOException {
        reloadData();
        SetupDevice();
        loginPage = new LoginPage(driver);
        signUpPage = new SignUpPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    public void SetupDevice() throws IOException {

        // URL of the Appium server
        URL url = new URL(sessionUrl);

        // Path to the APK file
        String path = System.getProperty("user.dir") + "/" + appPath;

        // Set UiAutomator2Options for Android
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(platformName);
        options.setDeviceName(deviceName); // Ensure the emulator name is correct and running
        options.setPlatformVersion(platformVersion);
        options.setAutomationName("UiAutomator2");

        // Set the path to the app (.apk file)
        options.setApp(path);

        // Automatically grant permissions
        options.setAutoGrantPermissions(true);

        // Initialize the driver with the specified options
        driver = new AndroidDriver(url, options);
    }


    public void reloadData() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/My data/config.properties");
        prop.load(fis);

        full_name = prop.getProperty("FullName");
        email     = prop.getProperty("Email");
        password  = prop.getProperty("Password");


        sessionUrl      = prop.getProperty("SessionUrl");
        platformName    = prop.getProperty("PlatformName");
        platformVersion = prop.getProperty("PlatformVersion");
        deviceName      = prop.getProperty("DeviceName");
        appPath         = prop.getProperty("AppPath");
    }

    @AfterTest
    public void CloseBase() {

    }
}
