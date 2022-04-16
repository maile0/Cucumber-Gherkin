Feature: Winbet Login

  Scenario: Logo presence on Winbet BG home page
    Given Launch Chrome browser
    When Open WINBET BG homepage
    Then Verify the logo is present on the page
    And Close the browser
