package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterPage extends Utility {


    By verifyRegisterAccount = By.xpath("//h1[contains(text(),'Register Account')]");
    By verifyReturningCustomer = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By fname= By.xpath("//input[@id='input-firstname']");
    By lname = By.xpath("//input[@id='input-lastname']");
    By email = By.xpath("//input[@id='input-email']");
    By number = By.xpath("//input[@id='input-telephone']");
    By password = By.xpath("//input[@id='input-password']");
    By confirmPassword = By.xpath("//input[@id='input-confirm']");
    By radioButton = By.xpath("//input[@type='radio'][@name='newsletter'][@value='1']");
    By privacyButton = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@type='submit']");
    By verifyMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueButton1 = By.xpath("//a[contains(text(),'Continue')]");
    By myAccount = By.xpath("//div[@class='list-group']//a[text()='My Account']");
    By verifyAccountLogout = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continueButton2 = By.xpath("//a[contains(text(),'Continue')]");
    By loginButton = By.xpath("//input[@type='submit']");
    By verifyMyAccount = By.xpath("//h2[contains(text(),'My Account')]");
    By myAccountLink1 = By.xpath("//div[@class='list-group']//a[text()='My Account']");
    By verifyAccountLOut = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continueButton3 = By.xpath("//a[contains(text(),'Continue')]");



    public void selectMyAccountOptions(String option) {
        List<WebElement> options = driver.findElements(By.linkText(option));
        for (WebElement element : options) {
            element.click();
        }
    }

    public void getRegisterAccount(){
        verifyText(verifyRegisterAccount,"Register Account","Register Account is not displayed");
    }

    public void getReturningCustomer(){
        verifyText(verifyReturningCustomer,"Returning Customer","Returning Customer is not displayed");
    }
    public void enterFields(){
        sendTextToElement(fname,"Poonam");
        sendTextToElement(lname,"Ramavat");
        sendTextToElement(email,"Punam7612398@gmail.com");
        sendTextToElement(number,"789456123");
        sendTextToElement(password,"Poonam123");
        sendTextToElement(confirmPassword,"Poonam123");
    }
    public void clickOnRadioButton(){
        clickOnElement(radioButton);
    }

    public void clickOnPrivacyButton(){
        clickOnElement(privacyButton);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void getMessage(){
        verifyText(verifyMessage,"Your Account Has Been Created!","Message is not displayed");
    }
    public void clickOnContinueButton1(){
        clickOnElement(continueButton1);
    }
    public void clickOnMyAccountLink1(){
        clickOnElement(myAccount);
    }
    public void getAccountLogout(){
        verifyText(verifyAccountLogout,"Account Logout","Account Logout is not displayed");
    }
    public void clickOnContinueButton2(){
        clickOnElement(continueButton2);
    }

    public void enterLoginFields(){
        sendTextToElement(email,"Punam123@gmail.com");
        sendTextToElement(password,"Poonam123");

    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void getMyAccountText(){
        verifyText(verifyMyAccount,"My Account","My Account is not displayed");
    }
    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink1);
    }
    public void getLogoutText(){
        verifyText(verifyAccountLOut,"Account Logout","Account Logout is not displayed");
    }
    public void clickOnContinueButton3(){
        clickOnElement(continueButton3);
    }

}
