package com.PostEducationPlanMobile.carina.demo.mobile.ios.component;

import com.PostEducationPlanMobile.carina.demo.mobile.common.*;
import com.PostEducationPlanMobile.carina.demo.mobile.common.component.TopHeaderBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.CartPage;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.MenuPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMainHeader extends TopHeaderBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Cart\"`]/XCUIElementTypeOther")
    private ExtendedWebElement cartItems;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Menu\"`]")
    private ExtendedWebElement menuBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Cart\"`]")
    private ExtendedWebElement cartBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"PRODUCTS\"`][2]")
    private ExtendedWebElement homeHeaderList;

    public TopMainHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public String getCartItems() {
        return cartItems.getAttribute("name");
    }

    @Override
    public CartPageBase clickCartBtn() {
        cartBtn.click();
        return new CartPage(driver);
    }

    @Override
    public MenuPageBase clickOnMenuBurgerBtn() {
        menuBtn.click();
        return new MenuPage(getDriver());
    }

}
