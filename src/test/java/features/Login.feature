#@F_1234
Feature: This feature is use to design the Login page of the application

  Background: Open the application #background is used to write the steps which are common in all scenarios nd done initially
    Given I have open the application in browser
#@Ignore
  @Sanity
  Scenario: Validate the successful login
    #Given I have open the application in browser  (given is pre-requisite)
    When I click on the login link
    And I enter username
    And I enter password
    And I click on login button
    Then I should be landed on the home page
   
   @Regression @Sanity
  Scenario: Validate the successful login using test data
    #Given I have open the application in browser  (given is pre-requisite)
    When I click on the login link
    And I enter username "abc@xvz.com"
    And I enter password "Pqr@1234"
    And I click on login button
    Then I should be landed on the home page

  @Regression @Rapid
  Scenario Outline: Validate the successful login using multiple test data #outline is used for example
    #Given I have open the application in browser  (given is pre-requisite)
    When I click on the login link
    And I enter username "<Username>"
    And I enter password "<Password>"
    And I click on login button
    Then I should be landed on the home page

    Examples: 
      | Username    | Password |
      | abc@xyz.com | pqr@1234 |
      | nic@acb.com | pqr@1234 |

  Scenario: Validate the Negative login
    #Given I have open the application in browser  (given is pre-requisite)
    When I click on the login link
    And I enter username "abc@xvz.com"
    And I enter password "Pqr@1234"
    And I click on login button
    Then I should get the error message as "The email or password you have entered is invalid"
