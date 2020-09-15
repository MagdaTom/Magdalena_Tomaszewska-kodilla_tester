package seasonchecker;

import java.time.MonthDay;

public class SeasonChecker {

    public String checkIfSummer(MonthDay date){
        if (date.isAfter(MonthDay.of(06,20)) && date.isBefore(MonthDay.of(9,24))){
            return "Yes! Summer!";
        }
        return "Nope";
    }
}
