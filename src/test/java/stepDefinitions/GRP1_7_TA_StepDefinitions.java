package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GRP1_7_TA;

import java.util.UUID;

public class GRP1_7_TA_StepDefinitions {

    GRP1_7_TA e7 = new GRP1_7_TA();
    @When("enter a value in to the username field which is less than {int} characters")
    public void enterAValueInToTheUsernameFieldWhichIsLessThanCharacters(int sayi) {

            String  Rndmname = UUID.randomUUID().toString().substring(0, sayi-1);
            System.out.println("Random Name: " + Rndmname);

            e7.sendKeysFunction(e7.adminUsername,Rndmname);
            e7.verifyContainsTextFunction(e7.shouldBe5Chracters,"at least 5");


    }


    @Then("verify that notification messages “Should be at least five characters” in red color displayed.")
    public void verifyThatNotificationMessagesShouldBeAtLeastFiveCharactersInRedColorDisplayed() {
    }

}
