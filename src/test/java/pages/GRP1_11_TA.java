package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

// POM : Page Object Model
public class GRP1_11_TA extends Parent {
    public GRP1_11_TA() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath="//*[text()='Add User']")
    public WebElement addUserText;

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
