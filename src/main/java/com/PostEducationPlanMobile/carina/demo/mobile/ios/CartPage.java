package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.CartPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = CartPage.class)
public class CartPage extends CartPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Labs Backpack\"`]")
    private ExtendedWebElement product;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Go Shopping\"`]")
    private ExtendedWebElement goShoppingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"REMOVE\"`][2]")
    private ExtendedWebElement removeBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPresent() {
        return product.isElementPresent();
    }

    @Override
    public HomePageBase clickContinueShopping() {
        goShoppingBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

    @Override
    public CartPageBase clickRemoveButton() {
       removeBtn.click();
       return this;
    }
}
