Feature: Registration Page
  Background:
    Given User is on ParaBank Dashboard screen
    And Registration link is displayed
    When User clicks on registration link
  Scenario Outline: Registration for ParaBank

    When User enters firstName "<firstName>"
    And User enters lastName "<LastName>"
    And User enters address "<Address>"
    And User enters city "<City>"
    And User enters state "<State>"
    And User enters zipcode <ZipCode>
    And User enters ssn <SSN>
    And User enters userName "<UserName>"
    And User enters password "<Password>"
    And User enters confirmPassword "<Confirm>"
    And User clicks on Register Button
    Then User is registered to ParaBank with "<UserName>" and "<Password>"
    Examples:
      | firstName | LastName | Address | City | State | ZipCode | SSN | UserName | Password | Confirm |
      | Madhuri67 | Kulkarni67 | Browning | Coventry | UK | 416410 | 123 | madhu67 | Abcd123 | Abcd123 |
      | Ashish67 | Kulkarni67 | Browning | Coventry | UK | 416410 | 123 | ashish67 | Abcd123 | Abcd123 |



  Scenario: ForgotInfo link is present
    Then ForgotInfo link is dispalyed

  Scenario: Title of the page
    Then Title of the page is "ParaBank | Register for Free Online Account Access11"