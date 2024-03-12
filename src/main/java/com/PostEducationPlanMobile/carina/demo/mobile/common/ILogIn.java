package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;

public interface ILogIn extends ICustomTypePageFactory {

    default ProductListPageBase loginApp() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        loginPageBase.login();
        return initPage(getDriver(), ProductListPageBase.class);
    }

}
