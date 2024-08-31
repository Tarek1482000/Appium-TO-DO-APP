package Pages;

import Pages.PageBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class LoginPage extends PageBase {

    public LoginPage(AppiumDriver driver){
            super(driver);
    }

    By Email= AppiumBy.xpath("//android.widget.EditText[@text=\"Enter your Email\"]");
    WebElement EmailElement ;

    By Password= AppiumBy.xpath("//android.widget.EditText[@text=\"Enter your Password\"]");
    WebElement PasswordElement ;

    By Login= AppiumBy.xpath("//android.widget.TextView[@text=\"Login\"]");
    WebElement LoginElement;


    static By SignUpBtnInLogin = AppiumBy.xpath(  "//android.widget.TextView[@text=\"Signup\"]");
    static WebElement SignUpElementBtnInLogin;


    public void EnterEmail(String Text){
        EmailElement = findElementByLocator(Email);
        EmailElement.clear();
        SendText(EmailElement,Text);
    }

    public void EnterPassword(String Text){
        PasswordElement = findElementByLocator(Password);
        PasswordElement.clear();
        SendText(PasswordElement,Text);
    }

    public void ClickingOnLogin(){
        LoginElement  = findElementByLocator(Login);
        Clicking(LoginElement);
    }

    public void LoginToApp( String email, String password){
        EnterEmail(email);
        EnterPassword(password);
        ClickingOnLogin();
    }

    public static void ClickingOnSignUpInLogin(){
        SignUpElementBtnInLogin  = findElementByLocator(SignUpBtnInLogin);
        Clicking(SignUpElementBtnInLogin);
    }

}
