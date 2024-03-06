package com.PostEducationPlanMobile.carina.demo.mobile.ios.component;

import com.PostEducationPlanMobile.carina.demo.mobile.common.*;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.MenuPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class TopHeader extends HeaderBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Cart\"`]/XCUIElementTypeOther")
    private ExtendedWebElement cartItems;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"1\"`][2]/XCUIElementTypeOther[2]")
    private ExtendedWebElement menuBtn;

    public TopHeader(WebDriver driver, SearchContext searchContext) {
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
