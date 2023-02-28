package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public WebDriver driver;
    public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();

    public WebDriver init_driver(String browser){
        System.out.println("Browser value is "+browser);
        if(browser.equalsIgnoreCase("chrome")){
            tlDriver.set(new ChromeDriver());
        }
        else if(browser.equalsIgnoreCase("edge")){
            tlDriver.set(new EdgeDriver());
        }
        else if(browser.equalsIgnoreCase("firefox")){
            tlDriver.set(new FirefoxDriver());
        }
        else{
            System.out.println("Please specify correct browser value"+browser);
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }
    public static synchronized WebDriver getDriver(){
        return tlDriver.get();
    }


}
