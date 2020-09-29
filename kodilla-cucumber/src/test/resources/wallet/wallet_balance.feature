Feature: Wallet balance

  Scenario: User checks the balance of his empty wallet
    Given there is 0 in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is 0
    And I should see message "No money in your wallet"

  Scenario: User checks the balance of his wallet after deposit transaction
    Given there is 50 in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is 50

  Scenario: User checks the balance of his wallet after two deposit transactions
    Given there is 50 in my wallet
    And I deposit additional 50 in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is 100