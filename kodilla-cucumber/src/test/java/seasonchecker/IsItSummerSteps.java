package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;
import java.util.HashMap;
import java.util.Map;

public class IsItSummerSteps implements En {


    private MonthDay today;
    private String answer;
    public static Map<String, MonthDay> calender = new HashMap<>();

    static {
        calender.put("last day of December", MonthDay.of(12, 31));
        calender.put("first day of August", MonthDay.of(8, 1));
        calender.put("10th day of February", MonthDay.of(2, 10));
        calender.put("20th day of June", MonthDay.of(6, 20));
        calender.put("21st day of June", MonthDay.of(6, 21));
    }

    @Summer
    public IsItSummerSteps() {
        Given("today is (.*) ", (String day) -> {
            today = IsItSummerSteps.calender.get(day);
//
//            this.today = MonthDay.of(12, 31);
//            this.today = MonthDay.of(8, 1);
//            this.today = MonthDay.of(2, 10);
//            this.today = MonthDay.of(6, 20);
//            this.today = MonthDay.of(6, 21);
        });

        When("I ask whether it's Summer", () -> {
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(today);


        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
