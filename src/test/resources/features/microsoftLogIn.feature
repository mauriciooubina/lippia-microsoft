Feature: As a user i need to log in my microsoft account

  @Smoke
  Scenario: The user wants to log in
    Given The user is in microsoft web page
    When The user clicks on log in button
    Then The user is able to write his email
