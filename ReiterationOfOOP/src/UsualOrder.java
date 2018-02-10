import accounts.Account;

public class UsualOrder implements Order {

    public int numberOrder() {
        return 1;
    }

    @Override
    public void getAccountMoney(Account account, double payment) {
        account.toPay(payment);
    }
}
