package com.PostEducationPlanMobile.carina.demo.mobile.common.component;

import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingComponentBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class HomeHeaderBase extends AbstractUIObject {
    public HomeHeaderBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public abstract SortingComponentBase clickOnSortBtn();
    public abstract void clickOnToggleBtn();

}
