package wallet;

import io.cucumber.java8.En;
import io.cucumber.java8.HookNoArgsBody;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class WalletSteps implements En {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });


        When("I request $30", () -> {
            cashier.withdraw(wallet, 30);
        });


        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Given("I have deposited $50 in my wallet", () -> {
            wallet.deposit(50);
            Assert.assertEquals(50, wallet.getBalance());

        });

        When("I request $50", () -> {
            cashier.withdraw(wallet, 50);

        });

        Then("$50 should be dispensed", () -> {
            Assert.assertEquals(50, cashSlot.getContents());
        });


        Given("I have deposited $60 in my wallet", () -> {
            wallet.deposit(60);
        });

        When("I request $70", () -> {
            cashier.withdraw(wallet, 70);
        });

        Then("$60 should be dispensed", () -> {
            Assert.assertEquals(60, cashSlot.getContents());
        });

        Given("I have deposited $0 in my wallet", () -> {
            int balance = wallet.getBalance();
            Assert.assertEquals(0, balance);
        });

        When("I request $10", () -> {
            cashier.withdraw(wallet, 10);
        });

        Then("$0 should be dispensed", () -> {
            Assert.assertEquals( 0, cashSlot.getContents());
        });
    }
}
