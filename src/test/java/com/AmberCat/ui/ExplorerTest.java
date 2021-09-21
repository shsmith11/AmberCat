package com.AmberCat.ui;

import com.AmberCat.data.PagesLinks;
import com.AmberCat.data.TickerParameters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplorerTest extends com.AmberCat.ui.BaseTest{

    public static final boolean testCase1 = true;
    public static final boolean testCase2 = true;

    @Test (priority = 1, enabled = testCase1, groups = {"Chrome"})
    public void BTCPriceCheck(){   //checking correct BTC price
        explorerPage.openPage(PagesLinks.explorerUrl);
        Assert.assertTrue(explorerPage.isCorrect("BTC-USD",TickerParameters.LAST_TRADE_PRICE)); // hardcoded format BTC-USD TODO ENUM for tickers
    }
}
