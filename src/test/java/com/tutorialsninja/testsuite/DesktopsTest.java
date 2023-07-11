package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.pages.TopMenuPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {

        //1.1 Mouse hover on Desktops Tab.and click
        topMenuPage.clickOnDesktops();
        Thread.sleep(1000);
        //1.2 Click on “Show All Desktops”
        topMenuPage.clickOnShowDesktops();
        Thread.sleep(1000);
        //1.3 Select Sort By position "Name: Z to A"
        desktopsPage.selectPosition();
        Thread.sleep(1000);
        //1.4 Verify the Product will arrange in Descending order.
        desktopsPage.sortProduct();
        Thread.sleep(1000);



    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        topMenuPage.clickOnCurrency();
        Thread.sleep(1000);

        //2.1 Mouse hover on Desktops Tab. and click
        topMenuPage.clickOnDesktops();
        Thread.sleep(1000);

        //2.2 Click on “Show All Desktops”
        topMenuPage.clickOnShowDesktops();
        Thread.sleep(1000);

        //2.3 Select Sort By position "Name: A to Z"
        desktopsPage.selectPosition();
        Thread.sleep(1000);

        //2.4 Select product “HP LP3065”
        desktopsPage.clickOnProduct();
        Thread.sleep(1000);

        //2.5 Verify the Text "HP LP3065"
        String expectedText = "HP LP3065";
        String actualText = productPage.getProductText();
        Assert.assertEquals(actualText, expectedText, "Product is not displayed");
        Thread.sleep(1000);

        //2.6 Select Delivery Date "2022-11-30"
        productPage.selectDatePicker();
        Thread.sleep(1000);

        //2.7.Enter Qty "1” using Select class.

        //2.8 Click on “Add to Cart” button
        productPage.clickOnAddToCart();
        Thread.sleep(1000);

        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedMsg = "Success: You have added HP LP3065 to your shopping cart!\n×";
        String actualMsg = shoppingCartPage.getMessageText();
        Assert.assertEquals(actualMsg, expectedMsg, "Message is not displayed");
        Thread.sleep(1000);

        //2.10 Click on link “shopping cart” display into success message
        shoppingCartPage.clickOnShoppingCart();
        Thread.sleep(1000);


        //2.11 Verify the text "Shopping Cart"
        shoppingCartPage.getShoppingCartText();
        Thread.sleep(1000);

        //2.12 Verify the Product name "HP LP3065"
        String expectedText2 = "HP LP3065";
        String actualText2 = shoppingCartPage.getProductText1();
        Assert.assertEquals(actualText2, expectedText2, "Text is not displayed");
        Thread.sleep(1000);

        //2.13 Verify the Delivery Date "2022-11-30"
//        String expectedDate = "Delivery Date:2022-11-30";
//        String actualDate = shoppingCartPage.getDateText();
//        Assert.assertEquals(actualDate, expectedDate, "Date is not displayed");

        //2.14 Verify the Model "Product21"
        String expectedModel = "Product 21";
        String actualModel = shoppingCartPage.getProductModel();
        Assert.assertEquals(actualModel, expectedModel, "Model is not displayed");
        Thread.sleep(1000);

        //2.15 Verify the Total "£74.73"
        String expectedTotal = "£74.73";
        String actualTotal = shoppingCartPage.getProductTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Total is not displayed");
        Thread.sleep(1000);
    }
}

