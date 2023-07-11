package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {

    By productText = By.xpath("//h1[contains(text(),'HP LP3065')]");

    By calenderButton = By.xpath("//div[@class = 'input-group date']//button");
    By selectMonthYear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");

    By clickNextButton = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']") ;

    By pickDate = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");

    By addToCart = By.xpath("//button[@id='button-cart']");
    By productMacbook = By.xpath("//a[text()='MacBook']");

    By verifyMacbook = By.xpath("//h1[contains(text(),'MacBook')]");

    By addTocart = By.xpath("//button[@id='button-cart']");
    By verifyProductMsg = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

    public String getProductText() {
        return getTextFromElement(productText);
    }

    public void selectDatePicker() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(calenderButton);
        while (true) {
            String monthAndYear = driver.findElement(selectMonthYear).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(clickNextButton);
            }
        }
        List<WebElement> allDates = driver.findElements(pickDate);
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }

    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void selectProductMacbook() {
        clickOnElement(productMacbook);
    }

    public void getMacbookText() {
        verifyText(verifyMacbook, "MacBook", "MacBook Product not display");
    }

    public void clickOnAddToCart1() {
        clickOnElement(addTocart);
    }
    public void getProductMessage() {
        verifyText(verifyProductMsg, "Success: You have added MacBook to your shopping cart!\n×", "Message is not displayed");
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }


}
