package testCases;

//import base.DriverInstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.Utility;

import java.io.IOException;

public class TC_001_ValidateLoginFunctionality {

	@Test
    public void loginFunctionality() throws IOException {

       // DriverInstance.initiateDriverInstance();
		// WebDriver driver;
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(Utility.fetchProperties("applicationUrl").toString());
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("shefi");
        loginPage.enterPassword("pass");
        loginPage.clickLogin();
        
    }
}
