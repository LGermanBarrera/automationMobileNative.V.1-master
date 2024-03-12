package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.PostEducationPlanMobile.carina.demo.mobile.common.component.HomeHeaderBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.component.TopHeaderBase;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class ProductListPageBase extends AbstractPage {
    public ProductListPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();
    public abstract TopHeaderBase getTopMainHeader();
    public abstract HomeHeaderBase getHomeHeader();
    public abstract ProductDetailPageBase clickOnProduct(int index);
    public abstract LoginPageBase clickLogin();
    public abstract String isProductTitlePresent();
    public abstract List<WebElement> getProductList();
    public abstract ProductListPageBase clickOnToggleBtn();
    public abstract List<WebElement> getAllProducts();
    public abstract ProductListPageBase clickOnAddBtn(int index);
    public abstract int getCartValue(String value);
}
