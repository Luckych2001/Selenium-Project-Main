package Base;

import Pages.CartPage;
import Pages.ContactUsPage;
import Pages.HomePage;
import Pages.ProductPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class BaseTest {

    public static WebDriver driver;
    public HomePage homePage;
    public ContactUsPage contactUsPage;
    public ProductPage productPage;
    public CartPage cartPage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }


}
