Feature: Find Transactions in Account Activity
  Background:
    Given the user is logged in
    When  the user clicks on "Savings" link on the Account Summary page

  @wip
  Scenario: Search date range
    Given the user accesses the Find Transactions tab
    When the user enters date range from “"2012-09-01"” to “"2012-09-06"”
    And clicks search
    Then results table should only show transactions dates between “"2012-09-01"” to “"2012-09-06"”
