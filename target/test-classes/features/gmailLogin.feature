Feature: Login Feature File

  @selenium
  Scenario: Login scenario test for Gmail

    Given navigate to gmail page
    When user logged in using username as fairwayqa and password as fairwayqalajolla
    Then inbox page should be displayed