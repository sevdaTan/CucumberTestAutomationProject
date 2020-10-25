@add_car
Feature: As a user, I want to be able to create a new car

  Scenario: 1. Add some car
    Given user is on login page
    And user logs in as a "store manager"
    And user navigates to "Fleet" and "Vehicles"
    And user clicks on create car button
    When user adds new vehicle information
      #Parameter | value
      | Licence Plate | SDET |
      | Model Year | 2021 |
