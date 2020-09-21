package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;


public class WalletSteps implements En {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("^I have deposited (.*) in my wallet$", (String amount) -> {
            int a = Integer.parseInt(amount);
            wallet.deposit(a);
            Assert.assertEquals("Incorrect wallet balance", a, wallet.getBalance());
        });

        When("^I request (.*)$", (String amount) -> {
            cashier.withdraw(wallet, Integer.parseInt(amount));
        });

        Then("^(.*) should be dispensed$", (String amount) -> {
            int a = Integer.parseInt(amount);
            Assert.assertEquals(a, cashSlot.getContents());
        });

    }
}
