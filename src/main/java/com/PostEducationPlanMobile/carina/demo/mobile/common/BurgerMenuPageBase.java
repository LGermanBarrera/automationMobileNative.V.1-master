package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BurgerMenuPageBase extends AbstractPage {
    public BurgerMenuPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract ProductListPageBase clickOnAllItems();
    public abstract LoginPageBase clickOnLogout();

}
