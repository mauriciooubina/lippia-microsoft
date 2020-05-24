Feature: As a user i need to write my email and password to log in my microsoft account

  @Smoke
  Scenario: The user wants to completely log in
    Given The user is in microsoft home web page
    When The user clicks log in button
    And the user writes his email mauriciooubina@hotmail.com
    Then The user is able to write his password

  @Smoke
  Scenario: The user forgot his password
    Given The user is in microsoft home web page
    When The user clicks log in button
    And the user writes his email mauriciooubina@hotmail.com
    And Clicks on the forgot password button
    Then The user is able to recover his password
