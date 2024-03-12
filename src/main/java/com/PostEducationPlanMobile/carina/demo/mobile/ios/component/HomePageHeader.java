package com.PostEducationPlanMobile.carina.demo.mobile.ios.component;

import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingComponentBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.component.HomeHeaderBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.SortingComponent;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageHeader extends HomeHeaderBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'test-Modal Selector Button'`]")
    private ExtendedWebElement sortBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'test-Toggle'`]")
    private ExtendedWebElement toggle;
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
        toggle.click();
    }

}
