package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

// POM : Page Object Model
public class GRP1_6_TA extends Parent {
    public GRP1_6_TA() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(name="username")
    public WebElement username;
    @FindBy(name="password")
    public WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement login;

    @FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']")
    public WebElement navAdmin;

    @FindBy(xpath="//input[@placeholder='Type for hints...']")
    public WebElement employeeName;

    @FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;

    @FindBy(xpath = "//*[text()='No Records Found']")
    public WebElement noRecordsFound;

    @FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message' and text()='Invalid']")
    public WebElement invalid;
    @FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    public WebElement boslukAdmin;



//    public WebElement getWebElement(String strButton){
//
//        switch (strButton)
//        {
//            case "gradeLevel2" : return gradeLevel2;
//        }
//        return null;
//    }
public void deleteItem(String searchedText) {

    }
}
