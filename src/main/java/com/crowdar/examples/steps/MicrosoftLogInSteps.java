package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.MicrosoftHomePage;
import com.crowdar.examples.pages.MicrosoftSearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MicrosoftLogInSteps extends PageSteps {

    @Given("The user is in microsoft web page")
    public void homePage() {
        Injector._page(MicrosoftHomePage.class).go();
    }

    @When("The user clicks on log in button")
    public void searchLogInBtn() {
        Injector._page(MicrosoftHomePage.class).clickLogInButton();
    }

    @Then("The user is able to write his email")
    public void emailWrite() {
        Assert.assertFalse(!Injector._page(MicrosoftSearchResultPage.class).getStats().isEmpty());
    }

    @And("Clicks on the create a new account button")
    public void searchNewAccountBtn() { Injector._page(MicrosoftHomePage.class).clickNewAccountBtn();   }
}
