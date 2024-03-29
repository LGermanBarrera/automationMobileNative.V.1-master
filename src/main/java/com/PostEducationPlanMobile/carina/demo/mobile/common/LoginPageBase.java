package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract ProductListPageBase clickLoginButton();
    public abstract ProductListPageBase login();
    public abstract LoginPageBase invalidLogin(String username, String password);
    public abstract boolean isErrorMessagePresent();
}
