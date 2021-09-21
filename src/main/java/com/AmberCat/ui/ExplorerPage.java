package com.AmberCat.ui;

import com.AmberCat.data.Locators;
import com.AmberCat.api.APIblockchain;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExplorerPage extends BasePage{

    public ExplorerPage(WebDriver driver) {

        super(driver, explicitWait);
    }

    public WebElement explorerBTCPrice(){return driver.findElement(By.xpath(Locators.explorerBTCPrice));}





    public boolean isCorrect(String tickerName, Enum tickerParam){
        boolean isCorrect;
        String tickerValue = APIblockchain.getTickerParameterValueAPI(tickerName, tickerParam.toString().toLowerCase().trim());
        String tickerOnPage = explorerBTCPrice().getText().replace("$","").replace(",","");
        if (tickerOnPage.contains(tickerValue)){
            isCorrect = true;
        } else isCorrect = false;
        System.out.println("Value on Page = " + tickerOnPage+ ",  Value API = "+ tickerValue);
        return isCorrect;
    }
}
