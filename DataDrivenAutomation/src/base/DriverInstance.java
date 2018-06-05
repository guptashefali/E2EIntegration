package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class DriverInstance {
	
	public static WebDriver driver;

	    @BeforeMethod
	    public static void initiateDriverInstance() throws IOException {

	        if(Utility.fetchProperties("browserName").toString().equalsIgnoreCase("chrome")){
	            System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
	            driver=new ChromeDriver();
	        }else if(Utility.fetchProperties("browserName").toString().equalsIgnoreCase("firefox")){
	            System.setProperty("webdriver.gecko.driver", "C:\\jars\\geckodriver.exe");
	            driver= new FirefoxDriver();
	        }else if(Utility.fetchProperties("browserName").toString().equalsIgnoreCase("IE")){
	            System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
	            // System.out.println("browser used is:" + browserType);
	            driver= new InternetExplorerDriver();
	        }else{
	            System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
	            driver=new ChromeDriver();
	        }
	        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	        driver.get(Utility.fetchProperties("applicationUrl").toString());

	    }
	   // @BeforeMethod
	    /*public static void initiateDriverInstance(String browerType){
	        {
	            if(browerType.equalsIgnoreCase("chrome")){
	                System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
	                driver=new ChromeDriver();
	            }else if(browerType.equalsIgnoreCase("firefox")){
	                System.setProperty("webdriver.gecko.driver", "C:\\jars\\geckodriver.exe");
	                driver= new FirefoxDriver();
	            }else if(browerType.equalsIgnoreCase("IE")){
	                System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
	                // System.out.println("browser used is:" + browserType);
	                driver= new InternetExplorerDriver();
	            }else{
	                System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
	                driver=new ChromeDriver();
	            }
	            driver.get("https://www.facebook.com/");

	        }

	    }*/


	    @AfterMethod
	    public void closeDriverInstance(){
	        driver.quit();
	    }
	}
