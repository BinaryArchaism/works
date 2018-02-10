public class Account {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }
    public void addDeposit(int deposit) {
        balance += deposit;
    }
}
