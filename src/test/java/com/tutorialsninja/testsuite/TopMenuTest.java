package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.TopMenuPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();
    DesktopsPage desktopsPage = new DesktopsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {

        //1.1 Mouse hover on “Desktops” Tab and click
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        //1.3 Verify the text ‘Desktops’

        topMenuPage.clickOnDesktops();
        Thread.sleep(1000);
        topMenuPage.clickOnShowDesktops();
        Thread.sleep(1000);
        String expectedText = "Desktops";
        String actualText = desktopsPage.getDesktopsText();
        Assert.assertEquals(actualText, expectedText, "Text page is not displayed");

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {

        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        //2.3 Verify the text ‘Laptops & Notebooks’

        topMenuPage.clickOnLaptopAndNotebooks();
        Thread.sleep(1000);
        topMenuPage.clickOnShowAllLaptopAndNotebook();
        Thread.sleep(1000);
        String expectedText = "Laptops & Notebooks";
        String actualText = topMenuPage.getLaptopAndNotebookText();
        Assert.assertEquals(actualText, expectedText, "Text page is not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException {
        //3.1 Mouse hover on “Components” Tab and click
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        //3.3 Verify the text ‘Components’

        topMenuPage.clickOnComponents();
        Thread.sleep(1000);
        topMenuPage.clickOnShowAllComponents();
        Thread.sleep(1000);
        String expectedText = "Components";
        String actualText = topMenuPage.getComponentsText();
        Assert.assertEquals(actualText, expectedText, "Text page is not displayed");
    }
}