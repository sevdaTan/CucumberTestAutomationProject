package com.vytrack.step_definitions;

import io.cucumber.java.en.*;



public class LoginStepDefinitions {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("I am on the login page");
    }


    @When("user logs in")
    public void user_logs_in() {
        System.out.println("Trying to login a sales manager");
    }

    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
        System.out.println("I see the page title  on the dashboard");
    }

}
