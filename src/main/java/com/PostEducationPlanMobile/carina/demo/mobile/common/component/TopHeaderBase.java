package com.PostEducationPlanMobile.carina.demo.mobile.common.component;

import com.PostEducationPlanMobile.carina.demo.mobile.common.CartPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.BurgerMenuPageBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class TopHeaderBase extends AbstractUIObject {
    public TopHeaderBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public abstract String getCartItems();
    public abstract CartPageBase clickCartBtn();
    public abstract BurgerMenuPageBase clickOnMenuBurgerBtn();
}
