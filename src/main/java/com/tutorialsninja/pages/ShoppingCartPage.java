package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By messageText = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By priceText = By.xpath("//div[@class='col-sm-4 col-sm-offset-8']//td[text()='£737.45']");

    By shoppingCart = By.xpath("//span[contains(text(),'Shopping Cart')]");

    By productName = By.xpath("//div[@class='table-responsive']//a[text()='HP LP3065']");
    By date = By.xpath("//small[contains(text(),'Delivery Date:2022-11-30')]");

    By productModel = By.xpath("//td[contains(text(),'Product 21')]");

    By total = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By verifyShoppingCart = By.xpath("//a[contains(text(),'Shopping Cart')]");

    By productName1 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");

    By changeQty = By.xpath("//input[contains(@name, 'quantity')]");

    By update = By.xpath("//button[@type='submit']");

    By verifyMsg = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    By checkOut = By.xpath("//a[contains(text(),'Checkout')]");

    By verifyCheckOut = By.xpath("//h1[contains(text(),'Checkout')]");



    public String getMessageText() {
        return getTextFromElement(messageText);

    }
    public String getPriceText() {
        return getTextFromElement(priceText);

    }

    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }


    public String getProductText1(){
        return getTextFromElement(productName);
    }

    public String getDateText(){
        return getTextFromElement(date);
    }

    public  String getProductModel(){
        return getTextFromElement(productModel);
    }

    public String getProductTotal(){
        return getTextFromElement(total);
    }
    public void getShoppingCartText() {
        verifyText(verifyShoppingCart, "Shopping Cart", "Shopping Cart is not displayed");
    }

    public void getProductName() {
        verifyText(productName1, "MacBook", "Product name is not displayed");
    }

    public void sendQty() {
        driver.findElement(By.xpath("//div[@class='input-group btn-block']//input[@class='form-control']")).clear();
        sendTextToElement(changeQty, "2");
    }

    public void clickOnUpdate() {
        clickOnElement(update);
    }

    public void getMessage() {
        verifyText(verifyMsg, "Success: You have modified your shopping cart!\n×", "Message is not displayed");
    }

    public void clickOnCheckOut(){
        clickOnElement(checkOut);
    }

    public void getCheckOut(){
        verifyText(verifyCheckOut,"Checkout","Checkout is not displayed");
    }



}
