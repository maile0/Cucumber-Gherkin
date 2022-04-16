Feature: Login Winbet

  Scenario: Successfully login with valid credentials
    Given User launch Chrome browser
    When User opens URL "https://wb-user:1qwinbet@winbet-int.egt-digital.com/sports"
    And User clicks on Login button
    And User enters Username as "ggr" and Password as "Pass1234"
    Then User clicks on Submit button
    Then User clicks the Player icon
    And User clicks the Logout button
    And Close browser


  Scenario Outline: Login Data Driven
    Given User launch Chrome browser
    When User opens URL "https://wb-user:1qwinbet@winbet-int.egt-digital.com/sports"
    And User clicks on Login button
    And User enters Username as "<username>" and Password as "<password>"
    Then User clicks on Submit button
    Then User clicks the Player icon
    And User clicks the Logout button
    And Close browser

    Examples:
        | username | password |
        | ggr | Pass1234 |
        | ggr | WrongPass1234 |

