package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("^I have deposited (.*) in my wallet$", (String amount) -> {
            int depositedAmount = Integer.parseInt(amount);
            wallet.deposit(depositedAmount);
            Assert.assertEquals("Incorrect wallet balance", depositedAmount, wallet.getBalance());
        });

        When("^I request (.*)$", (String amount) -> {
            cashier.withdraw(wallet, Integer.parseInt(amount));
        });

        Then("^(.*) should be dispensed$", (String amount) -> {
            int dispensedAmount = Integer.parseInt(amount);
            Assert.assertEquals(dispensedAmount, cashSlot.getContents());
        });
    }
}
