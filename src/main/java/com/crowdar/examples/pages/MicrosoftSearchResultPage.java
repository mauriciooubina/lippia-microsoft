package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MicrosoftSearchResultPage extends PageBaseMicrosoft {
    private final String RESULT_SELECTOR = "head > title";
    private final String RESULT_APP = "/html/body/div[2]/section/div[1]/div[1]/div[3]/div[2]/div/ul/li[%s]/div/a/div[1]/picture/img";
    private final String FIRST_RESULT = "#coreui-productplacement-f2jtswf_9nblggh4msv6 > div > a > div.c-channel-placement-image > picture > img";

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

    public void clickResult(String position) {clickElement(By.xpath(String.format(RESULT_APP, position))); }

    public void clickFirstResult() {clickElement(By.cssSelector(FIRST_RESULT));}
}
