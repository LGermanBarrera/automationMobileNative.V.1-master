package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductListPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.LoginPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.BurgerMenuPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = BurgerMenuPageBase.class)
public class BurgerMenuPage extends BurgerMenuPageBase {
    @FindBy(xpath = "//android.widget.TextView[2]")
    private ExtendedWebElement catalogBtn;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGOUT']")
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
