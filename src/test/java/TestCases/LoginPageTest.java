package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase {

    @Test
    public static void ValidLoginTC() {
        loginPage.LoginToApp(email,password);
    }

    @AfterTest
    public void CloseLogin()
    {
        driver.quit();
    }
}
