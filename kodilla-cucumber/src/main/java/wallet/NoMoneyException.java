package wallet;

public class NoMoneyException extends Throwable {
    public NoMoneyException() {
        super("No money");
    }
}
