package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    private By username=By.name("username");
    private By password=By.name("password");
    private By loginButton=By.xpath("//input[@value=\"Log In\"]");

    public void enterUserName(String userName){
        driver.findElement(username).sendKeys(userName);
    }
    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }
    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public AccountPage doLogin(String username,String password){
        enterUserName(username);
        enterPassword(password);
        clickLogin();
        return new AccountPage(driver);
    }
}
