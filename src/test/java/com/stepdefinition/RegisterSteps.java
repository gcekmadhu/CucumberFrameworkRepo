package com.stepdefinition;

import com.factory.DriverFactory;
import com.page.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterSteps {

    private RegisterPage registerPage=new RegisterPage(DriverFactory.getDriver());
    private String userName;
    private String password;


    @Given("User is on ParaBank Dashboard screen")
    public void user_is_on_para_bank_dashboard_screen() {
        DriverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Given("Registration link is displayed")
    public void registration_link_is_displayed() {
        Assert.assertTrue(registerPage.isRegistrationLinkDisplayed());
    }

    @When("User clicks on registration link")
    public void user_clicks_on_registration_link() {
        registerPage.clickRegistrationLink();
    }

    @When("User enters firstName {string}")
    public void user_enters_first_name(String firstName) {
        registerPage.setFirstNameField(firstName);
    }

    @When("User enters lastName {string}")
    public void user_enters_last_name(String lastName) {
        registerPage.setLastNameField(lastName);
    }

    @When("User enters address {string}")
    public void user_enters_address(String address) {
        registerPage.setAddressField(address);
    }

    @When("User enters city {string}")
    public void user_enters_city(String city) {
        registerPage.setCityField(city);
    }

    @When("User enters state {string}")
    public void user_enters_state(String state) {
        registerPage.setStateField(state);
    }

    @When("User enters zipcode {int}")
    public void user_enters_zipcode(Integer zipcode) {
        registerPage.setZipCodeField(zipcode);
    }

    @When("User enters ssn {int}")
    public void user_enters_ssn(Integer ssn) {
        registerPage.setSSNField(ssn);
    }

    @When("User enters userName {string}")
    public void user_enters_user_name(String userName) {
        registerPage.setUserNameField(userName);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
        registerPage.setPasswordField(password);
    }

    @When("User enters confirmPassword {string}")
    public void user_enters_confirm_password(String confirmPassword) {
        registerPage.setConfirmPasswordField(confirmPassword);
    }

    @When("User clicks on Register Button")
    public void user_clicks_on_register_button() {
        registerPage.clickRegisterButton();
    }

    @Then("User is registered to ParaBank with {string} and {string}")
    public void user_is_registered_to_para_bank_with_and(String userName, String Password) {
        System.out.println("User is registered with " +userName+" and password "+password);
    }

    @Then("ForgotInfo link is dispalyed")
    public void forgot_info_link_is_dispalyed() {
        Assert.assertTrue(registerPage.isForgotPwdLinkDisplayed());
    }

    @Then("Title of the page is {string}")
    public void title_of_the_page_is(String expectedTitle) {
        Assert.assertEquals(expectedTitle,registerPage.getTitle());
    }



}
