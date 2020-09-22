package wallet;

import java.text.Format;
import java.text.NumberFormat;

public class Cashier {

    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if(wallet.getBalance() == 0){
            try {
                throw new NoMoneyException();
            } catch (NoMoneyException e) {
                System.out.println("No money in your wallet");
            }
            cashSlot.dispense(wallet.getBalance());
        }
        else if (amount > wallet.getBalance()) {
            cashSlot.dispense(wallet.getBalance());
            wallet.debit(wallet.getBalance());
        }
        else{
            wallet.debit(amount);
            cashSlot.dispense(amount);
        }
    }
}
