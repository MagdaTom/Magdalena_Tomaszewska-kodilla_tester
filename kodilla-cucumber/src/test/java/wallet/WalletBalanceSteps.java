package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletBalanceSteps implements En {

    private final Wallet wallet = new Wallet();
    private int balance;

    public WalletBalanceSteps() {

        Given("^there is (.*) in my wallet$", (String amount) -> {
            int depositedAmount = Integer.parseInt(amount);
            wallet.deposit(depositedAmount);
        });

        And("^I deposit additional (.*) in my wallet$", (String amount) -> {
            int depositedAmount = Integer.parseInt(amount);
            wallet.deposit(depositedAmount);
        });

        When("I check the balance of my wallet", () -> {
            this.balance = wallet.getBalance();
        });

        Then("^I should see that the balance is (.*)$", (String amount) -> {
            int balanceAmount = Integer.parseInt(amount);
            Assert.assertEquals(balanceAmount, balance);
        });

        Then("I should see message {string}", (String message) -> {
            System.out.println(message);
        });
    }
}
