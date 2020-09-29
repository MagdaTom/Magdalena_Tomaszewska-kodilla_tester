package wallet;

public class Cashier {

    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount)  {
        if(wallet.getBalance() == 0){
            System.out.println(wallet.getBalance());
            System.err.println("No money");
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
