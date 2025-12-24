package Pages;
import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class HomePage extends BaseTest {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    //--------------------
    @FindBy(linkText = "Video Tutorials")
    public WebElement videoTutorialsNav;

    public void clickOnVideoTutorialsNav() {
        videoTutorialsNav.click();
    }
    //--------------------
    @FindBy (linkText = "Contact us")
    public WebElement contactUsNav;

    public void clickOnContactUsNav(){
        contactUsNav.click();
    }

    @FindBy(id = "susbscribe_email")
    public WebElement subscriptionField;

    public void inputSubscriptionEmail(String email){
        subscriptionField.clear();
        subscriptionField.sendKeys(email);
    }
    //--------------------
    @FindBy(id = "subscribe")
    public WebElement arrowButton;

    public void clickOnArrowButton(){
        arrowButton.click();
    }
    //--------------------
    @FindBy(id = "success-subscribe")
    public WebElement subscribeNotification;
    //--------------------

    @FindBy(id = "scrollUp")
    public WebElement scrollUpButton;

    public void clickOnScrollUpButton(){
        scrollUpButton.click();
    }
    //--------------------
    @FindBy(className = "col-sm-8")
    public WebElement navigationBar;
    //--------------------

    @FindBy(css = "a[href^='/product_details/']")
    public List<WebElement> viewProductButtons;

    // Biranje producta
    public void clickViewProductByIndex(int index) {
        viewProductButtons.get(1).click();
    }




}




