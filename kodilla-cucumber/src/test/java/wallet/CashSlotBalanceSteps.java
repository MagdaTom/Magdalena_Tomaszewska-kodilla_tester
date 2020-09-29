package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class CashSlotBalanceSteps implements En {

    private  final Wallet wallet = new Wallet();
    private final CashSlot cashslot = new CashSlot();
    private final Cashier cashier = new Cashier(cashslot);
    private int balance;

    public CashSlotBalanceSteps() {

        Given("^there is (.*) withdrawn$", (String amount) -> {
            wallet.deposit(100);
            int withdrawAmount = Integer.parseInt(amount);
            cashier.withdraw(wallet, withdrawAmount);
        });

        When("I check the balance of the cash slot", () -> {
          this.balance = cashslot.getContents();
        });

        Then("^I should see that the cash slot balance is (.*)$", (String amount) -> {
            int cashSlotBalance = Integer.parseInt(amount);
            Assert.assertEquals(cashSlotBalance, balance);
        });
    }
}


