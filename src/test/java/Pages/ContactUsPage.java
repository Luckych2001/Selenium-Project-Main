package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BaseTest {

    public ContactUsPage(){
        PageFactory.initElements(driver, this);
    }
    //--------------------
    @FindBy(className = "form-control")
    public WebElement nameField;

    public void inputName(String name){
        nameField.clear();
        nameField.sendKeys(name);
    }
    //--------------------
    @FindBy(css = "input[type='email']")
    public WebElement emailField;

    public void inputEmail(String email){
        emailField.clear();
        emailField.sendKeys(email);
    }
    //--------------------
    @FindBy(css = "input[name='subject']")
    public WebElement subjectField;

    public void inputSubjectField(String subject){
        subjectField.clear();
        subjectField.sendKeys(subject);
    }
    //--------------------
    @FindBy(id = "message")
    public WebElement messageField;

    public void inputMessage(String message){
        messageField.clear();
        messageField.sendKeys(message);
    }
    //--------------------
    @FindBy(css = "input[type='submit']")
    public WebElement submitButton;

    public void clickOnSubmitButton() {
        submitButton.click();
    }
    //--------------------
    @FindBy(id = "form-section")
    public WebElement homeButton;
    //--------------------

}
