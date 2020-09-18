Feature: Is number divisible by 3 or 5 or 15?
  Students want to know if it's divisible by 3 or 5 or 15

  Scenario Outline: Is number divisible by 3 or 5 or 15 or not
    Given <numberA>
    When I ask whether it's divisible by 3 or 5 or 15
    Then I should be told <answer>
    Examples:
      | numberA | answer     |
      | 3       | "Fizz"     |
      | 27      | "Fizz"     |
      | 246     | "Fizz"     |
      | -9      | "Fizz"     |
      | 0       | "None"     |
      | 7       | "None"     |
      | 59      | "None"     |
      | -8      | "None"     |
      | - 88    | "None"     |
      | 60      | "FizzBuzz" |
      | 255     | "FizzBuzz" |
      | -600    | "FizzBuzz" |
      | 25      | "Buzz"     |
      | 250     | "Buzz"     |
      | -65     | "Buzz"     |