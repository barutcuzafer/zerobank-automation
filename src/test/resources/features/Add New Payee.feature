Feature: Add new payee under pay bills
  Background:
    Given the user is logged in
    When  the user clicks on "Savings" link on the Account Summary page
  @wip
  Scenario: Add a new payee
    Given Add New Payee tab
    #And creates new payee using following information
    #  |Payee Name     | The Law Offices of Hyde, Price & Scharks|
     # |Payee Address  | 100 Same st, Anytown, USA, 10001 |
      #|Account        | Checking |
      #|Payee Details | XYZ account |