package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MicrosoftSearchResultPage extends PageBaseMicrosoft {
    private final String RESULT_SELECTOR = "head > title";

    private WebElement stats() {
        return getWebElement(By.cssSelector(RESULT_SELECTOR));
    }

    public MicrosoftSearchResultPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public String getStats() {
        return stats().getText();
    }

    public String getTitle(){
        return driver.getTitle();
    }

}
