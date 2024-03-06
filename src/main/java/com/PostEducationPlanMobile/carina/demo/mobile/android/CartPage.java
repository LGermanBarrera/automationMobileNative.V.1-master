package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.CartPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Item\"]")
    private ExtendedWebElement product;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CONTINUE SHOPPING\"]")
    private ExtendedWebElement continueShoppingBtn;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-REMOVE\"]")
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
        continueShoppingBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }
    @Override
    public CartPageBase clickRemoveButton() {
     removeBtn.click();
        return initPage(getDriver(), CartPageBase.class);
    }
}
