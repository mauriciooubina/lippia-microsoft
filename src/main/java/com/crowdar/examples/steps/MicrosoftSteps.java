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

public class MicrosoftSteps extends PageSteps {

    @Given("The user is in microsoft page")
    public void home() {
        Injector._page(MicrosoftHomePage.class).go();
    }

    @When("The user search for word (.*)")
    public void search(String criteria) {
        Injector._page(MicrosoftHomePage.class).clickSearchButton();
        Injector._page(MicrosoftHomePage.class).enterSearchCriteria(criteria);
        Injector._page(MicrosoftHomePage.class).clickSearchButton();
    }

    @Then("The user verify that results are shown properly")
    public void statVerification() {
        Assert.assertFalse(!Injector._page(MicrosoftSearchResultPage.class).getStats().isEmpty());
    }

    @And("clicks on the result in (.*)")
    public void clicksOnTheResult(String position) {Injector._page(MicrosoftSearchResultPage.class).clickResult(position);}

    @And("clicks on the first result")
    public void clicksOnTheFirstResult() {Injector._page(MicrosoftSearchResultPage.class).clickFirstResult(); }
}
