import accounts.Account;

public interface Order {
    int numberOrder();
    void getAccountMoney(Account account, double payment);
}
