package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    // Element Locator
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;


    @FindBy(id = "lastname")
    public static WebElement LastNameField;


    @FindBy(id = "email_address")
    public static WebElement EmailAddressField;

    @FindBy(id = "password")
    public static WebElement PassWordField;
    @FindBy(id = "password-confirmation")
    public static WebElement PassWordConfirmation;
    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAnAccountButton;


    // Initialize WebElement Using Selenium
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    // Method to describe web element action
    public void enterFirstName(String Firstname){
        FirstNameField.sendKeys(Firstname);
    }

    public void enterLastName(String LastName){
        LastNameField.sendKeys(LastName);
    }
    public void enterEmailAddress(String EmailAddress){
        EmailAddressField.sendKeys(EmailAddress);
    }
    public void enterPassword(String Password){
        PassWordField.sendKeys(Password);
    }
    public void enterConfirmPassWord(String ConfirmPassword){
        PassWordConfirmation.sendKeys(ConfirmPassword);
    }
    public void clickCreateAccountButton(){
        CreateAnAccountButton.click();
    }


    // Element Locator
    @FindBy(id ="<input name=\"login[username]")
    public static WebElement EmailField;


    // Element Locator
    @FindBy(name ="login[password]")
    public static WebElement PasswordField;

    // Initialize WebElement Using Selenium
    public SigneInPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    // Method to describe web element action
    public void SignInLink(){
        SignInLink.click();
    }



















}
