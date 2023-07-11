package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By guestCheckOut = By.xpath("//input[@value='guest']");
    By verifyNewCustomer = By.xpath("//h2[contains(text(),'New Customer')]");
    By continueButton = By.xpath("//input[@id='button-account']");
    By firstname = By.xpath("//input[@id='input-payment-firstname']");
    By lastname = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By number = By.xpath("//input[@id='input-payment-telephone']");

    By address = By.xpath("//input[@id='input-payment-address-1']");

    By city = By.xpath("//input[@id='input-payment-city']");
    By postCode = By.xpath("//input[@id='input-payment-postcode']");

    By country = By.xpath("//select[@id='input-payment-country']");
    By zone = By.xpath("//select[@id='input-payment-zone']");

    By continueGuest = By.xpath("//input[@id='button-guest']");

    By commentsArea= By.xpath("//textarea[@name='comment']");

    By checkBox = By.xpath("//input[@name='agree']");

    By paymentContinue = By.xpath("//input[@id='button-payment-method']");



    public void getNewCustomer(){
        verifyText(verifyNewCustomer,"New Customer","New customer is not displayed");
    }

    public void clickOnGuest(){
        clickOnElement(guestCheckOut);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public void enterMandatoryField(){
        sendTextToElement(firstname,"Poonam");
        sendTextToElement(lastname,"Ramavat");
        sendTextToElement(email,"poonam@gmail.com");
        sendTextToElement(number,"7894561369");
        sendTextToElement(address,"alconbury close");
        sendTextToElement(city,"warrington");
        sendTextToElement(postCode,"wa12jl");
        selectByVisibleTextFromDropDown(country,"India");
        selectByVisibleTextFromDropDown(zone,"Goa");
    }

    public void clickOnContinueGuest(){
        clickOnElement(continueGuest);
    }

    public void enterComment(){
        sendTextToElement(commentsArea,"Thank You");
    }

    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }

    public void clickOnPaymentContinue(){
        clickOnElement(paymentContinue);
    }

}
