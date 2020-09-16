Feature: Is number divisible by 5?
  Students want to know if it's divisible by 5

  Scenario Outline: Is number divisible by 5 or not
    Given <number>
    When I ask whether it's divisible by 5
    Then I should be told <answer>
    Examples:
      | number | answer |
      | 5      | "Buzz" |
      | 25     | "Buzz" |
      | 250    | "Buzz" |
      | -65    | "Buzz" |
      | 0      | "None" |
      | 7      | "None" |
      | 59     | "None" |
      | -8     | "None" |