Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
  Customer requests full amount from his wallet
    Given I have deposited $50 in my wallet
    When I request $50
    Then $50 should be dispensed

  Scenario: Partial withdrawal from a wallet in credit
  Customer requests higher amount then his wallet
    Given I have deposited $60 in my wallet
    When I request $70
    Then $60 should be dispensed

  Scenario: Unsuccessful withdrawal from a wallet in credit
  Customer has no money in his wallet
    Given I have deposited $0 in my wallet
    When I request $10
    Then $0 should be dispensed

