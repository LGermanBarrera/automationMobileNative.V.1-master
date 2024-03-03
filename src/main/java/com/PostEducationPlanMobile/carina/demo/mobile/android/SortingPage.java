package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = SortingPageBase.class)
public class SortingPage extends SortingPageBase {
    public SortingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePageBase clickNameAscending() {
        return null;
    }

    @Override
    public HomePageBase clickNameDescending() {
        return null;
    }

    @Override
    public HomePageBase clickPriceAscending() {
        return null;
    }

    @Override
    public HomePageBase clickPriceDescending() {
        return null;
    }
}
