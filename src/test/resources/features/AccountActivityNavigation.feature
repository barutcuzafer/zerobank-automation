Feature: Navigating to specific accounts in Accounts Activity
  Background:
    Given the user is logged in

  Scenario Outline:
    When  the user clicks on "<Zafer>" link on the Account Summary page
    Then the Account Activity page should be displayed
    And  Account drop down should have "<Zafer>" selected
    Examples:
    |Zafer|
    |Savings|
    |Brokerage|
    |Checking|
    |Credit Card|
    |Loan|


#
 # Scenario:Brokerage account redirect
 #    When  the user clicks on "Brokerage" link on the Account Summary page
   #  Then the Account Activity page should be displayed
   #  And  Account drop down should have "Brokerage" selected
  # Scenario:Checking  account redirect
  #   When  the user clicks on "Checking" link on the Account Summary page
  #   Then the Account Activity page should be displayed
   #  And  Account drop down should have "Checking" selected
  # Scenario:Savings Credit Card redirect
   #  When  the user clicks on "Credit Card" link on the Account Summary page
   #  Then the Account Activity page should be displayed
   #  And  Account drop down should have "Credit Card" selected
  # Scenario:Loan account redirect
  #   When  the user clicks on "Loan" link on the Account Summary page
  #   Then the Account Activity page should be displayed
   #  And  Account drop down should have "Loan" selected



