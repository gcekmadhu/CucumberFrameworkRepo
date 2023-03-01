Feature: Account Page Feature
  Background:
  Given User has already logged in to application
  |username|password|
  |ash12|Abcd123|

  @accounts
  Scenario: Accounts page title
    Given user is on Accounts page
    When user gets the title of the page
    Then page title should be "ParaBank | Accounts Overview"

  @accounts
  Scenario: Accounts section count
    Given user is on Accounts page
    Then user gets accounts section
      |Open New Account|
      |Accounts Overview|
      |Transfer Funds|
      |Bill Pay|
      |Find Transactions|
      |Update Contact Info|
      |Request Loan|
      |Log Out|
    And accounts section count should be 8