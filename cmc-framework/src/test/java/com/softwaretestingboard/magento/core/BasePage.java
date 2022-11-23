package com.softwaretestingboard.magento.core;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject {
    public void clickToElement(WebElementFacade element) {
        element.click();
    }
}
