package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SortingComponentBase extends AbstractPage {
    public SortingComponentBase(WebDriver driver) {
        super(driver);
    }
    public abstract ProductListPageBase clickNameAscending();
    public abstract ProductListPageBase clickNameDescending();
    public abstract ProductListPageBase clickPriceAscending();
    public abstract ProductListPageBase clickPriceDescending();
}
