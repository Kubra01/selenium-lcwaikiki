package testlogger;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;

public class LogInTest extends BaseTest {
    private ChromeDriver driver;

    @Test
    public void LogInTest() {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "https://www.lcwaikiki.com/tr-TR/TR/giris" );

        WebElement usernameText = driver.findElement( By.name("LoginEmail"));
        WebElement passwordText = driver.findElement( By.name("Password"));
        WebElement LoginButton = driver.findElement( By.id("loginLink") );

        usernameText.sendKeys( "kubrasaglam1@gmail.com" );
        passwordText.sendKeys( "kubra5" );
        LoginButton.click();

//        String actualUrl = "https://www.lcwaikiki.com/tr-TR/TR/Pantolon";
//        String expectedUrl = driver.getCurrentUrl();
//        Assert.assertEquals( expectedUrl, actualUrl );

    }
}