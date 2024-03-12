package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductListPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.LoginPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.BurgerMenuPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BurgerMenuPageBase.class)
public class BurgerMenuPage extends BurgerMenuPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == 'Catalog-tab-item'`]")
    private ExtendedWebElement catalogBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'LOGOUT'`]")
    private ExtendedWebElement logoutBtn;

    public BurgerMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductListPageBase clickOnAllItems() {
        catalogBtn.click();
        return initPage(getDriver(), ProductListPageBase.class);
    }

    @Override
    public LoginPageBase clickOnLogout() {
       logoutBtn.click();
        return initPage(getDriver(), LoginPageBase.class);
    }


}
