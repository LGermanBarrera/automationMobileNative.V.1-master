package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.*;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSwaglabsApp implements IAbstractTest, ILogIn {


    @Test(description = "[TC002]-testAddProductToCart")
    @MethodOwner(owner = "barrreraGerman")
    @TestLabel(name = "feature", value = {"mobile", "functionality"})
    public void testValidLogin() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        HomePageBase homePage = loginPageBase.login();

        Assert.assertTrue(homePage.isPageOpened(), "The page was not opened");
    }

    @Test(description = "[TC003]-testAddProductToCart")
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
    @MethodOwner(owner = "barrreraGerman")
    @TestLabel(name = "feature", value = {"mobile", "functionality"})
    public void testAddProductToCart() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        HomePageBase homePage = loginPageBase.login();

        Assert.assertTrue(homePage.isPageOpened(), "The page was not opened");
        HeaderBase header = homePage.getHeader();
        Assert.assertTrue(header.isUIObjectPresent(), "Header menu was not found");

        //First I click on a product because a value can't be reached.
        homePage.clickOnToggleBtn().clickOnAddBtn(0);
        int initialItemCount = homePage.getCartValue(header.getCartItems());
        homePage.clickOnAddBtn(1);
        int updatedItemAmount = homePage.getCartValue(header.getCartItems());

        Assert.assertTrue(initialItemCount < updatedItemAmount, "The product was NOT added to cart");
    }

    @Test(description = "[TC005]-testAddProductToCart")
    @MethodOwner(owner = "barrreraGerman")
    @TestLabel(name = "feature", value = {"mobile", "functionality"})
    public void testRemoveProductFromCart() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        HomePageBase homePage = loginPageBase.login();

        Assert.assertTrue(homePage.isPageOpened(), "The page was not opened");
        HeaderBase header = homePage.getHeader();
        Assert.assertTrue(header.isUIObjectPresent(), "Header menu was not found");

        CartPageBase cart = header.clickCartBtn();
        //here we check the cart is empty
        Assert.assertFalse(cart.isProductPresent(), "The cart is not empty");
        cart.clickContinueShopping();
        homePage.clickOnAddBtn(0);
        header.clickCartBtn();
        //Now we check is effectively a product was added to the cart
        Assert.assertTrue(cart.isProductPresent(), "it was not added a product to cart");
        cart.clickRemoveButton();

        //here we check the cart is empty again
        Assert.assertFalse(cart.isProductPresent(), "The cart is not empty");


    }

}
