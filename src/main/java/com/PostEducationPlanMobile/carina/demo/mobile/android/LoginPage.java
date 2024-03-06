package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.LoginPageBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private ExtendedWebElement username;
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private ExtendedWebElement password;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private ExtendedWebElement loginBtn;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private ExtendedWebElement errorMessage;
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public HomePageBase clickLoginButton() {
        return initPage(getDriver(), HomePageBase.class);
    }
    @Override
    public HomePageBase login() {
    username.type(R.TESTDATA.get("user"));
    password.type(R.TESTDATA.get("password"));
        loginBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

    @Override
    public LoginPageBase invalidLogin(String user, String pass) {
      username.type(user);
      password.type(pass);
      loginBtn.click();
        return initPage(getDriver(), LoginPageBase.class);
    }
    @Override
    public boolean isErrorMessagePresent() {
        return errorMessage.isElementPresent();
    }


}
