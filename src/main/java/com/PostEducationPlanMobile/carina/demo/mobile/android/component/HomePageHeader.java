package com.PostEducationPlanMobile.carina.demo.mobile.android.component;

import com.PostEducationPlanMobile.carina.demo.mobile.android.SortingComponent;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductHeaderBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingComponentBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePageHeader extends ProductHeaderBase {
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement sortBtn;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/android.widget.ImageView")
    private ExtendedWebElement toggleBtn;
    public HomePageHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public SortingComponentBase clickOnSortBtn() {
      sortBtn.click();
        return new SortingComponent(driver);
    }
    @Override
    public void clickOnToggleBtn() {
        toggleBtn.click();
    }
}
