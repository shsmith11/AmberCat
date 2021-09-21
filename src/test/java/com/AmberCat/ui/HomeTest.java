package com.AmberCat.ui;

import com.AmberCat.data.PagesLinks;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends com.AmberCat.ui.BaseTest {

    public static final boolean testCase1 = true;
    public static final boolean testCase2 = true;
    public static final boolean testCase3 = true;
    public static final boolean testCase4 = false;
    public static final boolean testCase5 = false;
    public static final boolean testCase6 = true;

    @Test (priority = 1, enabled = testCase1, groups = {"Chrome"})
    public void isHomePage(){
        homePage.openPage(PagesLinks.homeUrl);
        Assert.assertTrue(homePage.isHome());
    }
    
}
