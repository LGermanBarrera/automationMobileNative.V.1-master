package com.PostEducationPlanMobile.carina.demo.mobile.android.component;

import com.PostEducationPlanMobile.carina.demo.mobile.android.CartPage;
import com.PostEducationPlanMobile.carina.demo.mobile.android.BurgerMenuPage;
import com.PostEducationPlanMobile.carina.demo.mobile.common.CartPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.component.TopHeaderBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.BurgerMenuPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TopMainHeader extends TopHeaderBase {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/sortIV")
    private ExtendedWebElement sortBtn;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Menu']/android.view.ViewGroup")
    private ExtendedWebElement menuBtn;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement cartItemCount;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement cartIcon;
    public TopMainHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    @Override
    public CartPageBase clickCartBtn(){
        cartIcon.click();
        return new CartPage(getDriver());
    }
    @Override
    public BurgerMenuPageBase clickOnMenuBurgerBtn() {
            menuBtn.click();
            return new BurgerMenuPage(getDriver());
    }
    @Override
    public String getCartItems() {
        return cartItemCount.getAttribute("text");
    }

}
