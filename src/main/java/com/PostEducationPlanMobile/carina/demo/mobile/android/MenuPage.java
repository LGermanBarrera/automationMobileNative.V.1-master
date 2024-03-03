package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.LoginPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.MenuPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = MenuPageBase.class)
public class MenuPage extends MenuPageBase {

    @FindBy(xpath = "//android.widget.TextView[2]")
    private ExtendedWebElement catalogBtn;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePageBase clickOnCatalogue() {
       catalogBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

}
