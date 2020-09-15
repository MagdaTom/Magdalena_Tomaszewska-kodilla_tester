Feature: Is it Summer?
  Everybody likes Summer

  Scenario: Winter isn't Summer
    Given today is last day of December
    When I ask whether it's Summer
    Then I should be told "Nope"