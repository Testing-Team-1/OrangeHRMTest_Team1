package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.GWD;

public class GRP1_4_ASY {

    pages.GRP1_4_ASY locators4= new pages.GRP1_4_ASY();
    @Given("Go to the mainpage")
    public void goToTheMainpage() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Write your admin username and password")
    public void writeYourAdminUsernameAndPassword() {
        locators4.sendKeysFunction(locators4.username4, "Admin");
        locators4.sendKeysFunction(locators4.password4, "admin123");
        locators4.clickFunction(locators4.loginButton4);
       // GWD.getDriver().switchTo().alert().accept();


    }

    @Then("Click on Admin, user management page")
    public void clickOnAdminUserManagementPage() {

        locators4.clickFunction(locators4.adminLink4);
    }

    @And("Click on add button")
    public void clickOnAddButton() {
        locators4.clickFunction(locators4.addButton4);
    }

    @And("Click on saveButton without filling up any mandatory field")
    public void clickOnSaveButtonWithoutFillingUpAnyMandatoryField() {
        locators4.clickFunction(locators4.saveButton4);
    }

    @Then("The error message shall be visible under each of mandatory field")
    public void theErrorMessageShallBeVisibleUnderEachOfMandatoryField() {

        for (WebElement w : locators4.errorMessages4) {
            Assert.assertTrue(w.isEnabled());
        }
        }
}
