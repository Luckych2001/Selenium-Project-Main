package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends BaseTest {
    public ProductPage(){
        PageFactory.initElements(driver, this);
    }
    //--------------------
    @FindBy(css = "button[type='button']")
    public WebElement addToCartButton;

    public void clickOnAddToCardButton(){
        addToCartButton.click();
        }
    //--------------------
    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")
    public WebElement viewCartHyperLink;

    public void clickOnViewCartHyperLink(){
        viewCartHyperLink.click();
    }
    //--------------------


    }


