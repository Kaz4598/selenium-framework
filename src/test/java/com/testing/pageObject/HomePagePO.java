package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    // Element Locator
    @FindBy(linkText = "SignIn")
    public static WebElement SignInLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;


    // Initialize WebElement Using Selenium
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }



    // Method to describe web element action
    public void SignInLink(){
        SignInLink.click();
    }

    public void clickSignInLink(){
        SignInLink.click();
    }













}
