package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.SigneInPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;



public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;

    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String Firstname, String Lastname, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(Firstname);
        createAccountPagePO.enterLastName(Lastname);
        createAccountPagePO.enterEmailAddress(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassWord(ConfirmPassword);
    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
    }


    @Given("I am on signIn page")
    public void iAmOnSignInPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        HomePagePO.SignInLink();

    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        SigneInPagePO signeInPagePO = new SigneInPagePO(driver);
        SigneInPagePO.EmailField (Email);
        SigneInPagePO.PasswordField (Password);

    }

    @And("I click on sign in")
    public void iClickOnSignIn() {
        SigneInPagePO signeInPagePO = new SigneInPagePO(driver);
        SigneInPagePO.SignInButton();

    }

    @Then("My registered customer account page is displayed")
    public void myRegisteredCustomerAccountPageIsDisplayed() {
    }
}




