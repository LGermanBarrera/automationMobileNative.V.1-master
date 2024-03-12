package com.PostEducationPlanMobile.carina.demo.mobile.ios.component;

import com.PostEducationPlanMobile.carina.demo.mobile.common.*;
import com.PostEducationPlanMobile.carina.demo.mobile.common.component.TopHeaderBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.CartPage;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.BurgerMenuPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TopMainHeader extends TopHeaderBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'test-Cart'`]/XCUIElementTypeOther")
    private ExtendedWebElement cartItems;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='test-Menu']")
    private ExtendedWebElement hamburgerButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'test-Cart'`]")
    private ExtendedWebElement cartBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'PRODUCTS'`][2]")
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
    public BurgerMenuPageBase clickOnMenuBurgerBtn() {
        menuBtn.click();
        return new BurgerMenuPage(getDriver());
    }

}
