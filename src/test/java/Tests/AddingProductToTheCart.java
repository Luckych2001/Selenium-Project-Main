package Tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.ContactUsPage;
import Pages.HomePage;
import Pages.ProductPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingProductToTheCart extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");

        homePage = new HomePage();
        contactUsPage = new ContactUsPage();
        productPage =new ProductPage();
        cartPage = new CartPage();
    }

    @Test
    public void addProductToTheCart() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 700);");
        homePage.clickOnViewProductButton();
        productPage.clickOnAddToCardButton();
        Thread.sleep(2000);
        productPage.clickOnViewCartHyperLink();
        Assert.assertTrue(cartPage.quantityBox.isDisplayed());
        Assert.assertTrue(cartPage.proceedToCheckoutButton.isDisplayed());

    }
}
