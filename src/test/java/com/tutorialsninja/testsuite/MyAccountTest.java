package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {

    MyAccountsPage myAccountsPage = new MyAccountsPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        //1.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccount();
        Thread.sleep(1000);

        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        registerPage.selectMyAccountOptions("Register");
        Thread.sleep(1000);

        //1.3 Verify the text “Register Account”.
        registerPage.getRegisterAccount();
        Thread.sleep(1000);

    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        //2.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccount();
        Thread.sleep(1000);

        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        registerPage.selectMyAccountOptions("Login");
        Thread.sleep(1000);

        //2.3 Verify the text “Returning Customer”
        registerPage.getReturningCustomer();
        Thread.sleep(1000);
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        //3.1 Clickr on My Account Link.
        myAccountsPage.clickOnMyAccount();
        Thread.sleep(1000);

        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        registerPage.selectMyAccountOptions("Register");
        Thread.sleep(1000);

        //3.3 Enter First Name
        //3.4 Enter Last Name
        //3.5 Enter Email
        //3.6 Enter Telephone
        //3.7 Enter Password
        //3.8 Enter Password Confirm
        registerPage.enterFields();
        Thread.sleep(1000);

        //3.9 Select Subscribe Yes radio button
        registerPage.clickOnRadioButton();
        Thread.sleep(1000);

        //3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivacyButton();
        Thread.sleep(1000);

        //3.11 Click on Continue button
        registerPage.clickOnContinueButton();
        Thread.sleep(1000);

        //3.12 Verify the message “Your Account Has Been Created!”
        registerPage.getMessage();
        Thread.sleep(1000);

        //3.13 Click on Continue button
        registerPage.clickOnContinueButton1();
        Thread.sleep(1000);

        //3.14 Click on My Account Link.
        registerPage.clickOnMyAccountLink1();
        Thread.sleep(1000);

        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        registerPage.selectMyAccountOptions("Logout");
        Thread.sleep(1000);

        //3.16 Verify the text “Account Logout”
        registerPage.getAccountLogout();
        Thread.sleep(1000);

        //3.17 Click on Continue button
        registerPage.clickOnContinueButton2();
        Thread.sleep(1000);
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        //4.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccount();
        Thread.sleep(1000);
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        registerPage.selectMyAccountOptions("Login");
        Thread.sleep(1000);
        //4.3 Enter Email address
        //4.4 Enter Last Name
        //4.5 Enter Password
        registerPage.enterLoginFields();
        Thread.sleep(1000);
        //4.6 Click on Login button
        registerPage.clickOnLoginButton();
        Thread.sleep(1000);

        //4.7 Verify text “My Account”
        registerPage.getMyAccountText();
        Thread.sleep(1000);

        //4.8 Click on My Account Link.
        registerPage.clickOnMyAccountLink();
        Thread.sleep(1000);

        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        registerPage.selectMyAccountOptions("Logout");
        Thread.sleep(1000);

        //4.10 Verify the text “Account Logout”
        registerPage.getAccountLogout();
        Thread.sleep(1000);

        //4.11 Click on Continue button
        registerPage.clickOnContinueButton3();
        Thread.sleep(1000);
    }
}
