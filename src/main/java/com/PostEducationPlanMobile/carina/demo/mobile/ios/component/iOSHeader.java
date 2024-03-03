package com.PostEducationPlanMobile.carina.demo.mobile.ios.component;

import com.PostEducationPlanMobile.carina.demo.mobile.common.*;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.CartPage;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.IOSHomePage;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.MenuPage;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.SortingPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.annotations.Predicate;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class iOSHeader extends HeaderBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Cart\"`]/XCUIElementTypeOther")
    private ExtendedWebElement cartItems;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"1\"`][2]/XCUIElementTypeOther[2]")
    private ExtendedWebElement menuBtn;

    public iOSHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public String getCartItems() {
       return cartItems.getAttribute("name");
    }

    @Override
    public CartPageBase clickCartBtn() {
        return null;
    }

    @Override
    public MenuPageBase clickOnMenuBurgerBtn() {
        menuBtn.click();
        return new MenuPage(getDriver());
    }

}
