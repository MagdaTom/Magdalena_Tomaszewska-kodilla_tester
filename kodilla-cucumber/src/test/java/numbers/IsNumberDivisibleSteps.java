package numbers;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsNumberDivisibleSteps implements En {

    private String answer;

    public IsNumberDivisibleSteps() {
        When("^I ask whether (.*) is divisible$", (String number) -> {
            int providedNumber = Integer.parseInt(number);
            Numbers numbers = new Numbers();
            this.answer = numbers.divisibilityChecker(providedNumber);
        });


        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, answer);
        });
    }
}
