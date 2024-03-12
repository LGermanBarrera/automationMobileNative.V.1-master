package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartPageBase extends AbstractPage {
    public CartPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean isProductPresent();
    public abstract ProductListPageBase clickContinueShopping();
    public abstract CartPageBase removeProductFromCart();
}
