package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;



public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("http://qa1.vytrack.com");
    }


    @When("user logs in")
    public void user_logs_in() throws InterruptedException {
        loginPage.login();
        Thread.sleep(3000);
    }

    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
        String expected = "Dashboard";
        String actual = loginPage.getPageSubTitleText().trim();

        Assert.assertEquals("Title is not correct!", expected, actual);


        System.out.println("I see the dashboard page!");
      Driver.closeDriver();
    }

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage.login(string);

    }
// user logs in as "storemanager85" valid username and wrong password
    @When("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
       loginPage.login(string,string2);
    }

    //    String expected = "Invalid user name or password."
//    Then user verifies that "Invalid user name or password." message is displayed
    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String expected) {
        String actualResult = loginPage.getWarningMessageText();
        Assert.assertEquals(expected, actualResult);
    }


//    @Then("user verifies that {string} message is displayed")
//    public void user_verifies_that_message_is_displayed(String expected) {
//      String actualResult = loginPage.getWarningMessageText();
//        Assert.assertArrayEquals(expected,actualResult);
//
//    }



}
