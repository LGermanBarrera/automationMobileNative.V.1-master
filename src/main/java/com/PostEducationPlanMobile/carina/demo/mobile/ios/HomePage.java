package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.*;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.TopHeader;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Username Password LOGIN\"`]/XCUIElementTypeOther[1]/XCUIElementTypeImage")
    private ExtendedWebElement logoIcon;
    @FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[12]")
    private ExtendedWebElement loginBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Toggle\"`]")
    private ExtendedWebElement toggle;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"PRODUCTS\"`]")
    private ExtendedWebElement productTitle;
    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"headerContainer\"]")
    private TopHeader header;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"\uDB81\uDF41\"`]/XCUIElementTypeOther/XCUIElementTypeImage")
    private ExtendedWebElement productList;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"+\"`]")
    private ExtendedWebElement addButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logoIcon.isElementPresent();
    }

    @Override
    public HeaderBase getHeader() {
        return header;
    }

    @Override
    public ProductHeaderBase getProductHeader() {
        return null;
    }

    @Override
    public ProductPageBase clickOnProduct(int index) {
        List<WebElement> list = getProductList();
        list.get(index).click();
        return initPage(getDriver(), ProductPageBase.class);
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
    public HomePageBase clickOnToggleBtn() {
        toggle.click();
        return this;
    }

    @Override
    public List<WebElement> getAddBtnList() {
        return getDriver().findElements(addButton.getBy());

    }

    @Override
    public HomePageBase clickOnAddBtn(int index) {
        List<WebElement> list = getAddBtnList();
        list.get(index).click();
        return this;
    }

    @Override
    public int getCartValue(String value) {
        int intValue = Integer.parseInt(getHeader().getCartItems());
        return intValue;
    }
}
