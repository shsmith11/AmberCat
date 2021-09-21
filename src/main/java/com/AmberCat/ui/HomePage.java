package com.AmberCat.ui;


import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage{



    public HomePage(WebDriver driver) {
        super(driver, explicitWait);
    }

    public boolean isHome(){
        String expectedHomeTitle =  "Blockchain.com - The Most Trusted Crypto Company";
        try{
            explicitWait.until(ExpectedConditions.titleContains(expectedHomeTitle));
            return true;
        } catch (TimeoutException err) {
            return false;
        }
    }

}
