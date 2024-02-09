Feature: Login to mockai
@one
  Scenario: User can log in with valid credentials
    Given I am on the Mokkup AI login page
    When I enter my valid email "shafrinshifa64@gmail.com" address and password "Shifa@1995"
    And I click the login button
    Then I should be redirected to the dashboard page

  Scenario: User cannot log in with invalid credentials
    Given I am on the Mokkup AI login page
    When I should enter an invalid email "shafrinshifa64@gmail.com" address or password "Shifa1212"
    And I clicked the login button
    Then I should see an error message indicating invalid credentials
   

 
