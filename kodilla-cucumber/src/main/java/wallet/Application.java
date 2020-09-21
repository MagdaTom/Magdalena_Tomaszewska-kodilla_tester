package wallet;

public class Application {

    public static void main(String[] args) {

        CashSlot cashSlot = new CashSlot();
        Cashier cashier = new Cashier(cashSlot);
        Wallet wallet = new Wallet();


        wallet.getBalance();
        cashier.withdraw(wallet, 70);
        System.out.println(cashSlot.getContents());
    }
}
