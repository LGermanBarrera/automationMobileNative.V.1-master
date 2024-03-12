package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductDetailPageBase extends AbstractPage {
    public ProductDetailPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract void addToCartButton();
    public abstract void removeButton();
    public abstract ProductListPageBase backToProductsButton();



}
