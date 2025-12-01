package Tests;

import Base.BaseTest;
import Pages.ContactUsPage;
import Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubscriptionTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");

        homePage = new HomePage();
    }
    @Test
    public void subscribe(){
        String email="nikolalakic+4141@gmail.com";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        homePage.inputSubscriptionEmail(email);
        homePage.clickOnArrowButton();
        Assert.assertTrue(homePage.subscribeNotification.isDisplayed());
    }
}
