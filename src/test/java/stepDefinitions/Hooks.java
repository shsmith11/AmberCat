package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@MobileTest")
    public void beforeValidation(){
        System.out.println("Here before method only for annotation test group (@MobileTest)");
    }

    @After("@MobileTest")
    public void tearDownValidation(){
        System.out.println("Here AFTER method only for annotation test group (@MobileTest)");
    }

    @After()
    public void tearDown(){
        System.out.println("Here AFTER method FOR ALL scenarious");
    }

}
