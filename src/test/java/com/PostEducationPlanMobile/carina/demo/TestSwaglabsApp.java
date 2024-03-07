package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.*;
import com.PostEducationPlanMobile.carina.demo.mobile.common.component.TopHeaderBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestCaseKey;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSwaglabsApp implements IAbstractTest, ILogIn {


    @Test(description = "[TC002]-testAddProductToCart")
    @TestCaseKey("LBARR-1")
    @MethodOwner(owner = "barrreraGerman")
    @TestLabel(name = "feature", value = {"mobile", "functionality"})
    public void testValidLogin() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        HomePageBase homePage = loginPageBase.login();

        Assert.assertTrue(homePage.isPageOpened(), "The page was not opened");
    }

    @Test(description = "[TC003]-testAddProductToCart")
    @TestCaseKey("LBARR-2")
    @MethodOwner(owner = "barrreraGerman")
    @TestLabel(name = "feature", value = {"mobile", "functionality"})
    public void testInvalidLogin() {
        String invalidUsername = "Test user";
        String invalidPassword = RandomStringUtils.randomAlphabetic(10);
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        loginPageBase.invalidLogin(invalidUsername, invalidPassword);

        Assert.assertTrue(loginPageBase.isErrorMessagePresent(), "The page was opened");
    }

    @Test(description = "[TC004]-testAddProductToCart")
    @TestCaseKey("LBARR-3")
    @MethodOwner(owner = "barrreraGerman")
    @TestLabel(name = "feature", value = {"mobile", "functionality"})
    public void testAddProductToCart() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        HomePageBase homePage = loginPageBase.login();

        Assert.assertTrue(homePage.isPageOpened(), "The page was not opened");
        TopHeaderBase header = homePage.getTopMainHeader();
        Assert.assertTrue(header.isUIObjectPresent(), "TopMainHeader menu was not found");

        //First I click on a product because a value can't be reached.
        homePage.clickOnToggleBtn().clickOnAddBtn(0);
        int initialItemCount = homePage.getCartValue(header.getCartItems());
        homePage.clickOnAddBtn(1);
        int updatedItemAmount = homePage.getCartValue(header.getCartItems());

        Assert.assertTrue(initialItemCount < updatedItemAmount, "The product was NOT added to cart");
    }

    @Test(description = "[TC005]-testAddProductToCart")
    @TestCaseKey("LBARR-4")
    @MethodOwner(owner = "barrreraGerman")
    @TestLabel(name = "feature", value = {"mobile", "functionality"})
    public void testRemoveProductFromCart() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        HomePageBase homePage = loginPageBase.login();

        Assert.assertTrue(homePage.isPageOpened(), "The page was not opened");
        TopHeaderBase header = homePage.getTopMainHeader();
        Assert.assertTrue(header.isUIObjectPresent(), "TopMainHeader menu was not found");

        CartPageBase cart = header.clickCartBtn();

        Assert.assertFalse(cart.isProductPresent(), "The cart is not empty");
        cart.clickContinueShopping();
        homePage.clickOnAddBtn(0);
        header.clickCartBtn();

        Assert.assertTrue(cart.isProductPresent(), "it was not added a product to cart");
        cart.clickRemoveButton();

        Assert.assertFalse(cart.isProductPresent(), "The cart is not empty");

    }

}
