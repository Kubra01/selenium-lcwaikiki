package pages;

import org.apache.log4j.LogMF;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class LogInPage extends BasePage {
    public static final By usernameText = By.name("LoginEmail");
    public static final By passwordText = By.name("Password");
    public static final By LoginButton = By.id("loginLink");


    public LogInPage(WebDriver driver) {
        super( driver );
    }
}