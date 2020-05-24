package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MicrosoftHomePage extends PageBaseMicrosoft {

    private final String INPUT_SEARCH_XPATH = "//*[@id=\"cli_shellHeaderSearchInput\"]";
    private final String SEARCH_BUTTON_NAME = "search";
    private final String LOG_IN_BTN = "meControl";
    private final String INPUT_EMAIL_XPATH = "//*[@id=\"i0116\"]";
    private final String CONTINUE_BUTTON_NAME = "idSIButton9";
    private final String NEW_ACCOUNT_BTN = "signup";
    private final String FORGOT_PASSWORD_BTN = "idA_PWD_ForgotPassword";

    public MicrosoftHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }

    public void enterSearchCriteria(String text) {
        completeField(By.xpath(INPUT_SEARCH_XPATH), text);
    }

    public void clickSearchButton() {
        clickElement(By.id(SEARCH_BUTTON_NAME));
    }

    public void clickLogInButton() {clickElement(By.id(LOG_IN_BTN)); }

    public void writeEmail(String email) {completeField(By.xpath(INPUT_EMAIL_XPATH), email); }

    public void clickContinueButton() {clickElement(By.id(CONTINUE_BUTTON_NAME)); }

    public void clickNewAccountBtn() {clickElement(By.id(NEW_ACCOUNT_BTN));   }

    public void clickForgotPasswordButton() {clickElement(By.id(FORGOT_PASSWORD_BTN));}
}
