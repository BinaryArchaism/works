package accounts;

public class UsualAccount extends Account {
    @Override
    public void addDeposit(double deposit) {
        balance += deposit*0.9;
    }
    @Override
    public void toPay(double payment) {
        balance -= payment;
    }
}

