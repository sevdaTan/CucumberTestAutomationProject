@login
  Feature: Login
    As user, I want to be able to login under different roles
# For comment we use hashtag sign

  Scenario: Login as a Sales Manager
    Given user is on login page
    When user logs in
    Then user should see dashboard page


    @parametrized_test
   Scenario: Parametrized login
      Given user is on login page
      When user logs in as a "store manager"
      Then user should see dashboard page


    @negative_login
      Scenario: Invalid password
        Given user is on login page
        When user logs in with "storemanager85" username and "wrong" password
        Then user verifies that "Invalid user name or password." message is displayed

