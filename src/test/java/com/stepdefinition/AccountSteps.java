package com.stepdefinition;

import com.factory.DriverFactory;
import com.page.AccountPage;
import com.page.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AccountSteps {
    LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
    AccountPage accountPage;
    @Given("User has already logged in to application")
    public void user_has_already_logged_in_to_application(DataTable dataTable) {
        List<Map<String,String>> data=dataTable.asMaps();
        String username=data.get(0).get("username");
        String password=data.get(0).get("password");
        DriverFactory.getDriver().get("https://parabank.parasoft.com/");
        accountPage=loginPage.doLogin(username,password);
    }


    @Given("user is on Accounts page")
    public void user_is_on_accounts_page() {
        Assert.assertEquals("Account Services",accountPage.headerOfPage());

    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        Assert.assertEquals("ParaBank | Accounts Overview",accountPage.getTitle());
    }
    @Then("page title should be {string}")
    public void page_title_should_be(String pageTitle) {
        Assert.assertEquals(pageTitle,accountPage.getTitle());
    }

    @Then("user gets accounts section")
    public void user_gets_accounts_section(DataTable dataTable) {
       List<String> sectionList=dataTable.asList();

       Assert.assertEquals(sectionList,accountPage.getAccountSectionElements());

    }
    @Then("accounts section count should be {int}")
    public void accounts_section_count_should_be(Integer count) {
        if(accountPage.getAccountSectionCount()==count){
            System.out.println("count matched"+accountPage.getAccountSectionCount());
        }
    }




}
