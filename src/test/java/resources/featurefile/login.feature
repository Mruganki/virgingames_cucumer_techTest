Feature: Login Functionality

  As a User I want to login into virgingames website


@Smoke
  Scenario Outline: User should see error message displayed with invalid credentials

    Given I am on Homepage
    When I click on login link
    And I enter  "<userName>" in username field
    And I enter  "<passWord>" in password field
    And I click on login button
    Then I shouldsee error message "<errorMessage>"
    Examples:
      | userName | passWord | errorMessage |
    | Prime123 | password125|Please try again, your username/email or password has not been recognised |
    | Nkl      |            |Please try again, your username/email or password has not been recognised |
    |          | pass85     |Please try again, your username/email or password has not been recognised |
    |Prime@gmail.com|pass8523698956|Please try again, your username/email or password has not been recognised|
    |               |             | Please try again, your username/email or password has not been recognised|

