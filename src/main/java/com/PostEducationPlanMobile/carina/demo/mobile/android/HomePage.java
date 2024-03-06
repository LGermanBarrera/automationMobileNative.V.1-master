package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.android.component.TopHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.android.component.HomePageHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.common.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//android.widget.ImageView")
    private ExtendedWebElement logo;
    @FindBy(xpath = "//android.widget.TextView[@text(),'%s']")
    private ExtendedWebElement product;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]")
    private ExtendedWebElement menuBtn;

    @FindBy(xpath = "//android.view.ViewGroup[1]")
    private TopHeader topHeader;

    @FindBy(xpath = "//android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement productTitle;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])")
    private ExtendedWebElement productList;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/android.widget.ImageView")
    private ExtendedWebElement toggleBtn;

    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])")
    private ExtendedWebElement addButtons;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]")
    private HomePageHeader homePageHeader;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logo.isElementPresent();
    }

    @Override
    public TopHeader getHeader() {
        return topHeader;
    }

    @Override
    public ProductHeaderBase getProductHeader() {
        return homePageHeader;
    }

    @Override
    public ProductPageBase clickOnProduct(int index) {
        List<WebElement> element = getProductList();
        element.get(index).click();
        return initPage(getDriver(), ProductPageBase.class);
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
    public HomePageBase clickOnToggleBtn() {
        toggleBtn.click();
        return this;
    }

    @Override
    public List<WebElement> getAddBtnList() {
        return getDriver().findElements(addButtons.getBy());
    }

    @Override
    public HomePageBase clickOnAddBtn(int index) {
        List<WebElement> list = getAddBtnList();
        list.get(index).click();
        return this;
    }

    @Override
    public int getCartValue(String value) {
        return Integer.parseInt(getHeader().getCartItems());
    }


}
