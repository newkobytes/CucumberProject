Feature: Login Feature Scenario

  Background: 
    Given I have launched the application
    And I click on the Login Link

  Scenario: This scenario is to define the login happy path
    When I enter the correct username and password
    And I click on login button
    Then I should land on the home page

  @sanity
  Scenario: This scenario is to define the failure path
    When I enter the incorrect username and password
    And I click on login button
    Then I should get the error message "The email or password you have entered is invalid."

  @regression @1234
  Scenario: This scenario is to define the failure path
    When I enter the  username as "def@zs.com" and password as "Sharmila@123"
    And I click on login button
    Then I should get the error message "The email or password you have entered is invalid."

  Scenario Outline: This scenario is to define the failure path
    When I enter the  username as "<Username>" and password as "<Password>"
    And I click on login button
    Then I should get the error message "The email or password you have entered is invalid."

    Examples: 
      | Username    | Password |
      | abc@deg.com | Shar@123 |
      | ghj@efg.com | Shar@124 |
