Feature: Is number divisible by 3?
  Students want to know if it's divisible by 3

  Scenario Outline: Is number divisible by 3 or not
    Given <number>
    When I ask whether it's divisible by 3
    Then I should be told <answer>
    Examples:
      | number | answer |
      | 3      | "Fizz" |
      | 6      | "Fizz" |
      | 27     | "Fizz" |
      | 246    | "Fizz" |
      | -9     | "Fizz" |
      | 0      | "None" |
      | 7      | "None" |
      | 59     | "None" |
      | -8     | "None" |


