package accounts;

public abstract class Account {
    protected double balance = 0;

    public double getBalance() {
        return balance;
    }
    public abstract void addDeposit(double deposit);
    public abstract void toPay(double payment);
}
