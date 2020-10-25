package com.vytrack.step_definitions;

import com.vytrack.pages.CreateCarPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateCarStepDefinitions {
    CreateCarPage createCarPage = new CreateCarPage();

    @Given("user clicks on create car button")
    public void user_clicks_on_create_car_button() {
        createCarPage.clickOnCreateCar();
    }

    @When("user adds new vehicle information")
    public void user_adds_new_vehicle_information(io.cucumber.datatable.DataTable dataTable) {

    }


}
