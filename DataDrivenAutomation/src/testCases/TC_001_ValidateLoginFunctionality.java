package testCases;

import base.DriverInstance;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.IOException;

public class TC_001_ValidateLoginFunctionality extends DriverInstance{

	@Test
    public void loginFunctionality() throws IOException {

       // DriverInstance.initiateDriverInstance();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("shefi");
        loginPage.enterPassword("pass");
        loginPage.clickLogin();


    }
}
