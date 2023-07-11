package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {


    // Desktops Menu
    By desktopsLink = By.xpath("//a[text()='Desktops']");
    By showDesktopsLink = By.xpath("//a[contains(text(),'Show AllDesktops')]");

    By currency = By.xpath("//span[contains(text(),'Currency')]");

    By currencyType = By.xpath("//button[contains(text(),'£Pound Sterling')]");

    public void clickOnCurrency(){
        clickOnElement(currency);
        clickOnElement(currencyType);
    }


    public void clickOnDesktops() {
        clickOnElement(desktopsLink);
    }

    public void clickOnShowDesktops() {
        clickOnElement(showDesktopsLink);
    }

    // Laptop and Notebook Menu

    By laptopsAndNotebooksLink = By.xpath("//a[text()='Laptops & Notebooks']");
    By showlaptopAndNotebooksLink = By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]");
    By laptopAndNotebookText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");

    public void clickOnLaptopAndNotebooks() {
        clickOnElement(laptopsAndNotebooksLink);
    }

    public void clickOnShowAllLaptopAndNotebook() {
        clickOnElement(showlaptopAndNotebooksLink);
    }

    public String getLaptopAndNotebookText() {
        return getTextFromElement(laptopAndNotebookText);
    }

    // Component Menu

    By componentLink = By.xpath("//a[text()='Components']");
    By showComponentLink = By.xpath("//a[contains(text(),'Show AllComponents')]");
    By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    public void clickOnComponents() {
        clickOnElement(componentLink);
    }

    public void clickOnShowAllComponents() {
        clickOnElement(showComponentLink);
    }

    public String getComponentsText() {
        return getTextFromElement(componentsText);
    }



}
