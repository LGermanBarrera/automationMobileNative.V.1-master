package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductListPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingComponentBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SortingComponentBase.class)
public class SortingComponent extends SortingComponentBase {
    @FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup")
    private ExtendedWebElement ascendingNameBtn;
    @FindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement descendingNameBtn;
    @FindBy(xpath = "//android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement ascendingPriceBtn;
    @FindBy(xpath = "//android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement descendingPriceBtn;
    public SortingComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductListPageBase clickNameAscending() {
      ascendingNameBtn.click();
        return initPage(getDriver(), ProductListPageBase.class);
    }
    @Override
    public ProductListPageBase clickNameDescending() {
        descendingNameBtn.click();
        return initPage(getDriver(), ProductListPageBase.class);
    }
    @Override
    public ProductListPageBase clickPriceAscending() {
        ascendingPriceBtn.click();
        return initPage(getDriver(), ProductListPageBase.class);
    }
    @Override
    public ProductListPageBase clickPriceDescending() {
        descendingPriceBtn.click();
        return initPage(getDriver(), ProductListPageBase.class);
    }
}
