Feature: Cash slot balance

  Scenario: Cashier checks the cash slot balance before withdrawal
    Given there is 0 withdrawn
    When I check the balance of the cash slot
    Then I should see that the balance is 0

  Scenario: Cashier checks the cash slot balance after withdrawal
    Given there is 50 withdrawn
    When I check the balance of the cash slot
    Then I should see that the cash slot balance is 50

