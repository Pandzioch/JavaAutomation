Feature: LoginFeature
  this login feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page of the application
    And I enter the username as "admin" and password as "admin"
    And I enter the UserName and Password
      | username | password |
      | admin    | admin    |
    When I click login button
    Then I should see the userform page
