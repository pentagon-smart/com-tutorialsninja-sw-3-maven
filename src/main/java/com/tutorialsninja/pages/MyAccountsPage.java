package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {

    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    public void clickOnMyAccount(){
        clickOnElement(myAccountLink);
    }


}
