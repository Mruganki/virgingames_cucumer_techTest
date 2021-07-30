package com.virgingames.stepsdef;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {


    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLing();
    }

    @And("^I enter  \"([^\"]*)\" in username field$")
    public void iEnterInUsernameField(String userName)  {

        new LoginPage().enterUserName(userName);

    }

    @And("^I enter  \"([^\"]*)\" in password field$")
    public void iEnterInPasswordField(String passWord)  {

        new LoginPage().enterPassword(passWord);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I shouldsee error message \"([^\"]*)\"$")
    public void iShouldseeErrorMessage(String errorMessage)  {
        Assert.assertEquals("errorMessage",new LoginPage().getErrorMessage());

    }
}
