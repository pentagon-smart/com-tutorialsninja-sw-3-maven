package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {


    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
    By shortZToA = By.xpath("//select[@id='input-sort']");

    By productlink = By.xpath("//a[contains(text(),'HP LP3065')]");



    public String getDesktopsText() {
        return getTextFromElement(desktopsText);

    }
    public void selectPosition () {
        selectByVisibleTextFromDropDown(shortZToA,"Name (Z - A)");
    }

    public void sortProduct(){
        // Get all the products name and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        //1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        Assert.assertEquals(afterSortByZToAProductsName,originalProductsName,"Product not sorted into Z to A order");

    }


    public void clickOnProduct(){
        clickOnElement(productlink);
    }


}
