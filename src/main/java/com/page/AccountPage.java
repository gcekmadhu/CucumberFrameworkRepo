package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountPage {
    WebDriver driver;
    public AccountPage(WebDriver driver){
        this.driver=driver;
    }

    private By accountsSection=By.xpath("//div[@id=\"leftPanel\"]//ul/li/a");

    public List<String> getAccountSectionElements(){
        List<WebElement> leftPanelText=driver.findElements(accountsSection);
        List<String> leftPanel = new ArrayList<>();
        for(WebElement e:leftPanelText){
            System.out.println(e.getText());
            leftPanel.add(e.getText());
        }
        return leftPanel;
    }

    public int getAccountSectionCount(){
        return driver.findElements(accountsSection).size();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String headerOfPage(){
        return driver.findElement(By.xpath("//h2")).getText();
    }
}
