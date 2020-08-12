package arrays_iterate.ticket;


import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private final LocalDateTime timeOfPurchase;
   private final int validityTime;

   public Ticket(int validityTime){
       this(LocalDateTime.now(), validityTime);
   }
    public Ticket(LocalDateTime timeOfPurchase, int validityTime) {
        this.timeOfPurchase = timeOfPurchase;
        this.validityTime = validityTime;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public int getValidityTime() {
        return validityTime;
    }

    public boolean isValid() {
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(timeOfPurchase, currentTime);
        return duration.toMinutes() < validityTime;
    }
}
