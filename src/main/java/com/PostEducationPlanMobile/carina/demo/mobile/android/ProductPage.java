package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductPageBase.class)
public class ProductPage extends ProductPageBase {
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-BACK TO PRODUCTS\"]")
    private ExtendedWebElement backToProductBtn;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-REMOVE\"]")
    private ExtendedWebElement removeBtn;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]")
    private ExtendedWebElement addToCartBtn;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void addToCartButton() {
        addToCartBtn.click();
    }

    @Override
    public void removeButton() {
        removeBtn.click();
    }
    @Override
    public HomePageBase backToProductsButton() {
        backToProductBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }
}
