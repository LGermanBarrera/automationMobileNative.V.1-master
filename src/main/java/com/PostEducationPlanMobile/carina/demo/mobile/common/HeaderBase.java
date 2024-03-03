package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class HeaderBase extends AbstractUIObject {
    public HeaderBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public abstract String getCartItems();
    public abstract CartPageBase clickCartBtn();
    public abstract MenuPageBase clickOnMenuBurgerBtn();
}
