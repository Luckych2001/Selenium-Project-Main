package Tests;
import Base.BaseTest;
import Pages.ContactUsPage;
import Pages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FillingContactUs extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");

        homePage = new HomePage();
        contactUsPage = new ContactUsPage();
    }

    @Test
    public void fillingContactUsForm() {
        String name="Nikola";
        String email="nikolalakic43+1@gmail.com";
        String subject="Customer Review";
        String message="I'm giving you a 5 star review";

        homePage.clickOnContactUsNav();
        contactUsPage.inputName(name);
        contactUsPage.inputEmail(email);
        contactUsPage.inputSubjectField(subject);
        contactUsPage.inputMessage(message);
        contactUsPage.clickOnSubmitButton();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Assert.assertTrue(contactUsPage.homeButton.isDisplayed());

    }
}
