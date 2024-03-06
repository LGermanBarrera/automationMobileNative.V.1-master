package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingComponentBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

public class SortingComponent extends SortingComponentBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Name (Z to A)\"`]")
    private ExtendedWebElement nameAscendingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Name (A to Z)\"`]")
    private ExtendedWebElement nameDescendingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Price (low to high)\"`]")
    private ExtendedWebElement priceAscendingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Price (high to low)\"`]")
    private ExtendedWebElement priceDescendingBtn;


    public SortingComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePageBase clickNameAscending() {
       nameAscendingBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

    @Override
    public HomePageBase clickNameDescending() {
       nameDescendingBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

    @Override
    public HomePageBase clickPriceAscending() {
       priceAscendingBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

    @Override
    public HomePageBase clickPriceDescending() {
        priceDescendingBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }
}
