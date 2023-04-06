package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

// POM : Page Object Model
public class GRP1_9_ASY extends Parent {
    public GRP1_9_ASY() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath="(//mat-option//span)[2]")
    private WebElement gradeLevel2;

    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "gradeLevel2" : return gradeLevel2;
        }
        return null;
    }


    public void deleteItem(String searchedText) {

    }
}
