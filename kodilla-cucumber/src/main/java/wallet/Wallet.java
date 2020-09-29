package wallet;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        if(balance ==0){
            System.out.println("No money in your wallet");
        }
        return balance;
    }

    public void debit(int money) {
        this.balance -= money;
    }

}
