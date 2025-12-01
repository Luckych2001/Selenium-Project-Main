package Tests;

import Base.BaseTest;
import Pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VideoTutorials extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");

        homePage = new HomePage();
    }

    @Test
    public void openVideoTutorials() {
        homePage.clickOnVideoTutorialsNav();
        String expectedURL="https://www.youtube.com/c/AutomationExercise";
        String actualURL= driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
    }
}
