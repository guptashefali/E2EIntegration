package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName) {
        driver.findElement(By.id("email")).sendKeys(userName);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("pass")).sendKeys(password);

    }

    /*public void clickLogin() {
       // driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
        driver.findElement(By.cssSelector("input[type='submit'][id='u_0_2']")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"u_0_8\"]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(element).click().perform();
    	
    }*/
}
