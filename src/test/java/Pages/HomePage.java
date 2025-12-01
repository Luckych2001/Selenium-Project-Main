package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BaseTest {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    //--------------------
    @FindBy(xpath = "/html/body/header/div/div/div/div[2]/div/ul/li[7]/a")
    public WebElement videoTutorialsNav;

    public void clickOnVideoTutorialsNav() {
        videoTutorialsNav.click();
    }
    //--------------------
    @FindBy (xpath = "/html/body/header/div/div/div/div[2]/div/ul/li[8]/a")
    public WebElement contactUsNav;

    public void clickOnContactUsNav(){
        contactUsNav.click();
    }
    //--------------------      *****
    /*
    @FindBy(className = "col-sm-4")
    public WebElement viewProduct;

    public void chooseProduct(){
        List<WebElement> lista = driver.findElements(By.className("col-sm-4"));
        for (int i=0;i< lista.size();i++){
            if (lista.get(i).getText().equals("Mens Tshirt")){
                lista.get(i).click();
            }
        }
    }

     */
    //--------------------       *****
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

    @FindBy (xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[3]/div/div[2]/ul/li/a")
    public WebElement viewProductButton;

    public void clickOnViewProductButton(){
        viewProductButton.click();
    }



}




