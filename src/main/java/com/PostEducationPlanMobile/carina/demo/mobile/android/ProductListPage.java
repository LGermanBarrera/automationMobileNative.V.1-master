package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.android.component.TopMainHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.android.component.HomePageHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.common.*;
import com.PostEducationPlanMobile.carina.demo.mobile.common.component.HomeHeaderBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductListPageBase.class)
public class ProductListPage extends ProductListPageBase {

    @FindBy(xpath = "//android.widget.ImageView")
    private ExtendedWebElement logo;
    @FindBy(xpath = "//android.widget.TextView[@text(),'%s']")
    private ExtendedWebElement product;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Menu']")
    private ExtendedWebElement menuBtn;
    @FindBy(xpath = "//android.view.ViewGroup[1]")
    private TopMainHeader topHeader;
    @FindBy(xpath = "//android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement productTitle;
    @FindBy(xpath = "(//android.widget.TextView[@content-desc='test-Item title'])")
    private ExtendedWebElement productList;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Toggle']/android.widget.ImageView")
    private ExtendedWebElement toggleBtn;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])")
    private ExtendedWebElement addButtons;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart drop zone']")
    private HomePageHeader homePageHeader;
    public ProductListPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isPageOpened() {
        return logo.isElementPresent();
    }
    @Override
    public TopMainHeader getTopMainHeader() {
        return topHeader;
    }
    @Override
    public HomeHeaderBase getHomeHeader() {
        return homePageHeader;
    }
    @Override
    public ProductDetailPageBase clickOnProduct(int index) {
        List<WebElement> element = getProductList();
        element.get(index).click();
        return initPage(getDriver(), ProductDetailPageBase.class);
    }
    @Override
    public LoginPageBase clickLogin() {
        return null;
    }
    @Override
    public String isProductTitlePresent() {
        return productTitle.getText();
    }
    @Override
    public List<WebElement> getProductList() {
        List<WebElement> list = getDriver().findElements(productList.getBy());
        return list;
    }
    @Override
    public ProductListPageBase clickOnToggleBtn() {
        toggleBtn.click();
        return this;
    }
    @Override
    public List<WebElement> getAllProducts() {
        return getDriver().findElements(addButtons.getBy());
    }
    @Override
    public ProductListPageBase clickOnAddBtn(int index) {
        List<WebElement> list = getAllProducts();
        list.get(index).click();
        return this;
    }
    @Override
    public int getCartValue(String value) {
        return Integer.parseInt(getTopMainHeader().getCartItems());
    }


}
