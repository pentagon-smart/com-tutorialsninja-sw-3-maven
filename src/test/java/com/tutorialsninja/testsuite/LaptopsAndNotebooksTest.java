package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {
    TopMenuPage topMenuPage = new TopMenuPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {

        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        //1.2 Click on “Show All Laptops & Notebooks”

        topMenuPage.clickOnLaptopAndNotebooks();
        Thread.sleep(1000);
        topMenuPage.clickOnShowAllLaptopAndNotebook();
        Thread.sleep(1000);

        //1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortPrice();
        Thread.sleep(1000);

        //1.4 Verify the Product price will arrange in High to Low order.
        laptopsAndNotebooksPage.sortByPrice();
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        //2.2 Click on “Show All Laptops & Notebooks”

        topMenuPage.clickOnLaptopAndNotebooks();
        Thread.sleep(1000);
        topMenuPage.clickOnShowAllLaptopAndNotebook();
        Thread.sleep(1000);

        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortPrice();
        Thread.sleep(1000);

        //2.4 Select Product “MacBook”
        productPage.selectProductMacbook();
        Thread.sleep(1000);

        //2.5 Verify the text “MacBook”
        productPage.getMacbookText();
        Thread.sleep(1000);

        //2.6 Click on ‘Add To Cart’ button
        productPage.clickOnAddToCart();
        Thread.sleep(1000);

        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        productPage.getProductMessage();
        Thread.sleep(1000);

        //2.8 Click on link “shopping cart” display into success message
        productPage.clickOnShoppingCart();
        Thread.sleep(1000);

        //2.9 Verify the text "Shopping Cart"
        shoppingCartPage.getShoppingCartText();
        Thread.sleep(1000);

        //2.10 Verify the Product name "MacBook"
        shoppingCartPage.getProductName();
        Thread.sleep(1000);

        //2.11 Change Quantity "2"
        shoppingCartPage.sendQty();
        Thread.sleep(1000);

        //2.12 Click on “Update” Tab
        shoppingCartPage.clickOnUpdate();
        Thread.sleep(1000);

        //2.13 Verify the message “Success: You have modified your shopping cart!”
        shoppingCartPage.getMessage();
        Thread.sleep(1000);

        //2.14 Verify the Total £737.45
//        shoppingCartPage.getPriceText();
//        Thread.sleep(1000);

        //2.15 Click on “Checkout” button
        shoppingCartPage.clickOnCheckOut();
        Thread.sleep(1000);

        //2.16 Verify the text “Checkout”
        shoppingCartPage.getCheckOut();
        Thread.sleep(1000);

        //2.17 Verify the Text “New Customer”
        checkOutPage.getNewCustomer();
        Thread.sleep(1000);

        //2.18 Click on “Guest Checkout” radio button
        checkOutPage.clickOnGuest();
        Thread.sleep(1000);

        //2.19 Click on “Continue” tab
        checkOutPage.clickOnContinue();
        Thread.sleep(1000);

        //2.20 Fill the mandatory fields
        checkOutPage.enterMandatoryField();
        Thread.sleep(1000);

        //2.21 Click on “Continue” Button
        checkOutPage.clickOnContinueGuest();
        Thread.sleep(1000);

        //2.22 Add Comments About your order into text area
        checkOutPage.enterComment();
        Thread.sleep(1000);

        //2.23 Check the Terms & Conditions check box
        checkOutPage.clickOnCheckBox();
        Thread.sleep(1000);

        //2.24 Click on “Continue” button
        checkOutPage.clickOnPaymentContinue();
        Thread.sleep(1000);

        //2.25 Verify the message “Warning: Payment method required!”
    }
}
