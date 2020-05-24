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

public class MicrosoftPasswordSteps extends PageSteps {

    @Given("The user is in microsoft home web page")
    public void homePage() {
        Injector._page(MicrosoftHomePage.class).go();
    }

    @When("The user clicks log in button")
    public void searchLogInBtn() {
        Injector._page(MicrosoftHomePage.class).clickLogInButton();
    }

    @And("the user writes his email (.*)")
    public void writeEmail(String email) {
        Injector._page(MicrosoftHomePage.class).writeEmail(email);
        Injector._page(MicrosoftHomePage.class).clickContinueButton();
    }

    @Then("The user is able to write his password")
    public void theUserIsAbleToWriteHisPassword() {
        Assert.assertFalse(!Injector._page(MicrosoftSearchResultPage.class).getStats().isEmpty());
    }

    @And("Clicks on the forgot password button")
    public void searchForgotPasswordButton() {Injector._page(MicrosoftHomePage.class).clickForgotPasswordButton();  }

    @Then("The user is able to recover his password")
    public void theUserIsAbleToRecoverHisPassword() {
        Assert.assertEquals(Injector._page(MicrosoftSearchResultPage.class).getTitle(),"Iniciar sesión en tu cuenta Microsoft");
    }
}
