package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBaseMicrosoft extends PageBaseWeb {

    public PageBaseMicrosoft(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "https://www.microsoft.com/es-ar/";
    }


}
