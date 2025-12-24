package Pages;
import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    @FindBy(css = "div.modal-dialog.modal-confirm div.modal-body a[href='/view_cart']")
    public WebElement viewCartHyperLink;

    public void clickOnViewCartHyperLink(){
        viewCartHyperLink.click();
    }

}


