package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigneInPagePO {

    // Element Locator
    @FindBy(id = "email")
    public static WebElement EmailField;


    @FindBy(id = "login[password]")
    public static WebElement PasswordField;

    @FindBy(className = "customer-account-login page-layout-1column")
    public static WebElement SignInButton;


    // Initialize WebElement Using Selenium
    public SigneInPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Method to describe web element action
    public void enterEmail (String Email) {EmailField.sendKeys(Email);}
    public void Password (String Password) {PasswordField.sendKeys(Password);}
    public void ClickSignInButton () {SignInButton.click();}






}
