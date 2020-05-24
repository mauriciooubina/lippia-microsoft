Feature: As a user i need to search in microsoft to find an application

  @Smoke
  Scenario: The user search by "netflix"
    Given The user is in microsoft page
    When The user search for word netflix
    Then The user verify that results are shown properly

  @Smoke
  Scenario: The user search by "spotify"
    Given The user is in microsoft page
    When The user search for word spotify
    Then The user verify that results are shown properly

  @Smoke
  Scenario: The user search by "soundcloud"
    Given The user is in microsoft page
    When The user search for word soundcloud
    Then The user verify that results are shown properly
	
  @Smoke
  Scenario: The user search by "fifa"
    Given The user is in microsoft page
    When The user search for word fifa
    Then The user verify that results are shown properly

  @Smoke
  Scenario: The user search by "word"
    Given The user is in microsoft page
    When The user search for word word
    And clicks on the result in 3
    Then The user verify that results are shown properly

  @Smoke
  Scenario: The user search by "linux"
    Given The user is in microsoft page
    When The user search for word linux
    And clicks on the first result
    Then The user verify that results are shown properly