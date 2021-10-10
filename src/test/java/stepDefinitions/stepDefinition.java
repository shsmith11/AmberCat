package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class stepDefinition {

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Background section 1 - Validate the browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Background section 2 - Browser is triggered");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("Background section 3 - Check if browser is started");
    }


    @Given("^User is on NetBanking landing page$")
    public void user_is_on_NetBanking_landing() throws Throwable{
        System.out.println("User is on NetBanking landing page now");
    }
    @When("^User login into application with \"([^\"]*)\" username and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_username_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1 + "  "+ strArg2);
    }
    @Then("^Home page is populated$")
    public void user_is_on_NetBanking_is_on_home_page() throws Throwable{
        System.out.println("Home page is populated now");
    }@Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_are_displayed(String arg1) throws Throwable{
        System.out.println(arg1 +" Here card status");
    }
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>>  obj = data.asLists();

        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(1).get(2));
    }
    @When("^User login into app with (.+) username and password (.+)$")
    public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println(username+ "   "+ password);
    }



}
