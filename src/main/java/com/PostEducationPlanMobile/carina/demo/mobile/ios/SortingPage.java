package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

public class SortingPage extends SortingPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Name - Ascending\"`]")
    private ExtendedWebElement nameAscendingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Name - Descending\"`]")
    private ExtendedWebElement nameDescendingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Price - Ascending\"`]")
    private ExtendedWebElement priceAscendingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Price - Descending\"`]")
    private ExtendedWebElement priceDescendingBtn;


    public SortingPage(WebDriver driver) {
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
