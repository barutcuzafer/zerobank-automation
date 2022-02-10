Feature: Find Transactions in Account Activity
  Background:
    Given the user is logged in
    When  the user clicks on "Savings" link on the Account Summary page
    Given the user accesses the Find Transactions tab


 # Scenario Outline :Search date range
 #   Given the user accesses the Find Transactions tab
  #  When the user enters date range from “"<from>"” to “"<to>"”
 #   And clicks search
 #   Then results table should only show transactions dates between “"<from>"” to “"<to>"”
  #  Examples:
  #    |    from         |       to       |
  #    |    2012-09-01   |   2012-09-06   |
  #    |    2012-09-02   |   2012-09-06   |
  #  And the results should be sorted by most recent date
  #  And the results table should only not contain transactions dated “"2012-09-01"”

  Scenario: Search date range
    When the user enters date range from “"2012-09-01"” to “"2012-09-06"”
    And clicks search
    Then results table should only show transactions dates between “"2012-09-01"” to “"2012-09-06"”
    And the results should be sorted by most recent date
    Then the user enters date range from “"2012-09-02"” to “"2012-09-06"”
    And clicks search
    Then results table should only show transactions dates between “"2012-09-02"” to “"2012-09-06"”
    And the results table should only not contain transactions dated “"2012-09-01"”

  Scenario: Search description
    When the user enters description "ONLINE"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"
    When the user enters description "OFFICE"
    And clicks search
    Then results table should only show descriptions containing "OFFICE"
    #But  results table should not show descriptions containing "“OFFICE”"

  Scenario: Search description case insensitive
    When the user enters description "ONLINE"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"
    When the user enters description "online"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"
  @wip
  Scenario: Type
    And clicks search
    Then results table should show at least one result under Deposit
    Then results table should show at least one result under Withdrawal
    When user selects type "Deposit"
    And clicks search
    Then results table should show at least one result under Deposit
    But results table should show no result under "Withdrawal"
    When user selects type "Withdrawal"
    And clicks search
    Then results table should show at least one result under Withdrawal
    But results table should show no result under "Deposit"








