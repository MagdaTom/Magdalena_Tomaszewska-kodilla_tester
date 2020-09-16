Feature: Is number divisible by 3 and 5?
  Students want to know if it's divisible by 3 and 5

  Scenario Outline: Is number divisible by 3 and 5 or not
    Given <number>
    When I ask whether it's divisible by 3 and 5
    Then I should be told <answer>
    Examples:
      | number | answer     |
      | 15     | "FizzBuzz" |
      | 60     | "FizzBuzz" |
      | 255    | "FizzBuzz" |
      | -600   | "FizzBuzz" |
      | 0      | "None"     |
      | 18     | "None"     |
      | 59     | "None"     |
      | - 88   | "None"     |