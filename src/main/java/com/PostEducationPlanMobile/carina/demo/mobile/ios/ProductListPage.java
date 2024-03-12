package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.*;
import com.PostEducationPlanMobile.carina.demo.mobile.common.component.HomeHeaderBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.component.TopHeaderBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.HomePageHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.TopMainHeader;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductListPageBase.class)
public class ProductListPage extends ProductListPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'Username Password LOGIN'`]/XCUIElementTypeOther[1]/XCUIElementTypeImage")
    private ExtendedWebElement logoIcon;
    @FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[12]")
    private ExtendedWebElement loginBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'test-Toggle'`]")
    private ExtendedWebElement toggle;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == 'PRODUCTS'`]")
    private ExtendedWebElement productTitle;
    @FindBy(xpath = "//XCUIElementTypeOther[@name='headerContainer']")
    private TopMainHeader header;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'PRODUCTS'`][2]")
    private HomePageHeader homeHeader;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == '\uDB81\uDF41'`]/XCUIElementTypeOther/XCUIElementTypeImage")
    private ExtendedWebElement productList;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == '+'`]")
    private ExtendedWebElement addButton;

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logoIcon.isElementPresent();
    }

    @Override
    public TopHeaderBase getTopMainHeader() {
        return header;
    }

    @Override
    public HomeHeaderBase getHomeHeader() {
        return homeHeader;
    }

    @Override
    public ProductDetailPageBase clickOnProduct(int index) {
        List<WebElement> list = getProductList();
        list.get(index).click();
        return initPage(getDriver(), ProductDetailPageBase.class);
    }

    @Override
    public LoginPageBase clickLogin() {
        loginBtn.click();
        return initPage(getDriver(), LoginPageBase.class);
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
        toggle.click();
        return this;
    }

    @Override
    public List<WebElement> getAllProducts() {
        return getDriver().findElements(addButton.getBy());

    }

    @Override
    public ProductListPageBase clickOnAddBtn(int index) {
        List<WebElement> list = getAllProducts();
        list.get(index).click();
        return this;
    }

    @Override
    public int getCartValue(String value) {
     return     Integer.parseInt(getTopMainHeader().getCartItems());
    }
}
