package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
    private WebDriver driver;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private Integer zipcode;
    private Integer ssn;
    private String userName;
    private String password;
    private String confirmPwd;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPwd() {
        return confirmPwd;
    }

    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }



    private By firstNameLocator=By.id("customer.firstName");
    private By lastNameLocator=By.id("customer.lastName");
    private By addressLocator=By.id("customer.address.street");
    private By cityLocator=By.id("customer.address.city");
    private By stateLocator=By.id("customer.address.state");
    private By zipcodeLocator=By.id("customer.address.zipCode");
    private By ssnLocator=By.id("customer.ssn");
    private By userNameLocator=By.id("customer.username");
    private By passwordLocator=By.id("customer.password");
    private By confirmPwdLocator=By.id("repeatedPassword");
    private By forgotPwdLink=By.linkText("Forgot login info?");
    private By registerButton=By.xpath("//input[@value=\"Register\"]");
    private By registerLink=By.linkText("Register");

    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }
    public Boolean isForgotPwdLinkDisplayed(){
        return driver.findElement(forgotPwdLink).isDisplayed();
    }

    public void setFirstNameField(String firstName){
        setFirstName(firstName);
        driver.findElement(firstNameLocator).sendKeys(getFirstName());
    }
    public void setLastNameField(String lastName){
        setLastName(lastName);
        driver.findElement(lastNameLocator).sendKeys(getLastName());
    }
    public void setAddressField(String address){
        setAddress(address);
        driver.findElement(addressLocator).sendKeys(getAddress());
    }
    public void setCityField(String city){
        setCity(city);
        driver.findElement(cityLocator).sendKeys(getCity());
    }
    public void setStateField(String state){
        setState(state);
        driver.findElement(stateLocator).sendKeys(getState());
    }
    public void setZipCodeField(Integer zipcode){
        setZipcode(zipcode);
        driver.findElement(zipcodeLocator).sendKeys(getZipcode().toString());
    }
    public void setSSNField(Integer ssn){
        setSsn(ssn);
        driver.findElement(ssnLocator).sendKeys(getSsn().toString());
    }
    public void setUserNameField(String userName){
        setUserName(userName);
        driver.findElement(userNameLocator).sendKeys(getUserName());
    }
    public void setPasswordField(String password){
        setPassword(password);
        driver.findElement(passwordLocator).sendKeys(getPassword());
    }
    public void setConfirmPasswordField(String confirmPwd){
        setConfirmPwd(confirmPwd);
        driver.findElement(confirmPwdLocator).sendKeys(getConfirmPwd());
    }

    public void clickRegisterButton(){
        driver.findElement(registerButton).click();
    }

    public void clickRegistrationLink(){
        driver.findElement(registerLink).click();
    }
    public Boolean isRegistrationLinkDisplayed(){
        return driver.findElement(registerLink).isDisplayed();
    }



}
