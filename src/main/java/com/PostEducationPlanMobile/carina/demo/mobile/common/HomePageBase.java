package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.PostEducationPlanMobile.carina.demo.mobile.android.component.AndroidHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.iOSHeader;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class HomePageBase extends AbstractPage {
    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

    public abstract HeaderBase getHeader();

    public abstract ProductPageBase clickOnProduct(int index);

    public abstract LoginPageBase clickLogin();

    public abstract String isProductTitlePresent();

    public abstract List<WebElement> getProductList();

    public abstract HomePageBase clickOnToggleBtn();

    public abstract List<WebElement> getAddBtnList();

    public abstract HomePageBase clickOnAddBtn(int index);

    public abstract int getCartValue(String value);
}
