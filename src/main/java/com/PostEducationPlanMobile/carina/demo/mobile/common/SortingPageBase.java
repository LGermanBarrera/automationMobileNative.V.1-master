package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SortingPageBase extends AbstractPage {
    public SortingPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract HomePageBase clickNameAscending();
    public abstract HomePageBase clickNameDescending();
    public abstract HomePageBase clickPriceAscending();
    public abstract HomePageBase clickPriceDescending();
}
