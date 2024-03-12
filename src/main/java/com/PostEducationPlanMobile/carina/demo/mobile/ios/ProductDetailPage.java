package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductListPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductDetailPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductDetailPageBase.class)
public class ProductDetailPage extends ProductDetailPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'ADD TO CART'`][2]")
    private ExtendedWebElement addBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'BACK TO PRODUCTS'`][1]")
    private ExtendedWebElement backToProductBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'REMOVE'`][2]")
    private ExtendedWebElement removeBtn;

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void addToCartButton() {
        addBtn.click();
    }
    @Override
    public void removeButton() {
        removeBtn.click();
    }
    @Override
    public ProductListPageBase backToProductsButton() {
        backToProductBtn.click();
        return initPage(getDriver(), ProductListPageBase.class);
    }
}
