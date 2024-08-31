package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPage extends PageBase {

    public SignUpPage(AppiumDriver driver){
            super(driver);
    }


    By FullName= AppiumBy.xpath("//android.widget.EditText[@text=\"Enter your Full name\"]");
    WebElement FullNameElement ;

    By Email= AppiumBy.xpath("(//android.widget.EditText[@text=\"Enter your Email\"])[2]");
    WebElement EmailElement ;

    By Password= AppiumBy.xpath("(//android.widget.EditText[@text=\"Enter your Password\"])[2]");
    WebElement PasswordElement ;

    By SignUpBtn= AppiumBy.xpath("(//android.widget.TextView[@text=\"Signup\"])[2]");
    WebElement SignUpElementBtn;

    By LoginBtnInSignUp= AppiumBy.xpath("(//android.widget.TextView[@text=\"Login\"])[2]");
    WebElement LoginBtnElementInSignUp;




    public void EnterFullName(String Text){
        FullNameElement = findElementByLocator(FullName);
        FullNameElement.clear();
        SendText(FullNameElement,Text);
    }

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

    public void ClickingOnSignUp(){
        SignUpElementBtn  = findElementByLocator(SignUpBtn);
        Clicking(SignUpElementBtn);
    }

    public void SignUpToApp( String fullName,String email, String password){
        LoginPage.ClickingOnSignUpInLogin();
        EnterFullName(fullName);
        EnterEmail(email);
        EnterPassword(password);
        ClickingOnSignUp();
    }
}
