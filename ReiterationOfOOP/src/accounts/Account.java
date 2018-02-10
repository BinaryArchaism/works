package accounts;

public class Account {
    protected double balance = 0;

    public double getBalance() {
        return balance;
    }
    public void addDeposit(double deposit) {
        balance += deposit*0.9;
    }
}
