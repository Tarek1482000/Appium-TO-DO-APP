package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class SignUpPageTest extends TestBase {

    @Test
    public static void ValidSignUpTC() {
        signUpPage.SignUpToApp(full_name,email,password);
    }

    @AfterTest
    public void CloseLogin()
    {
        driver.quit();
    }
}
