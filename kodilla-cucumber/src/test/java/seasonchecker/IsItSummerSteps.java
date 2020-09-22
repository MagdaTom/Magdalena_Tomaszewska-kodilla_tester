package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;
import java.util.HashMap;
import java.util.Map;

public class IsItSummerSteps implements En {

    private MonthDay today;
    private String answer;

    public IsItSummerSteps() {
        Given("today is last day of December", () -> {
            this.today = MonthDay.of(12,31);
        });

        Given("today is first day of August", () -> {
            this.today = MonthDay.of(9, 1);
        });

        Given("today is 10th day of February", () -> {
            this.today = MonthDay.of(2, 10);
        });

        Given("today is 20th day of June", () -> {
            this.today = MonthDay.of(6, 20);
        });

        Given("today is 21st day of June", () -> {
            this.today = MonthDay.of(6, 21);
        });

        When("I ask whether it's Summer", () -> {
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
