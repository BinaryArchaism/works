import accounts.Account;
import accounts.UsualAccount;
import accounts.VIP;

/**
 * @author Dmitrii "BinaryArchaism" Dmitriev
 */

public class Main {
    public static void main(String[] args) {
        Account account = new UsualAccount();
        account.addDeposit(3000);

        Account vip = new VIP();
        vip.addDeposit(3000);

        System.out.println(account.getBalance()+ "\n" + vip.getBalance());

        Counter counter = new Counter();
        System.out.println(counter.max(account.getBalance(), vip.getBalance()));

        Order order = new UsualOrder();
        order.getAccountMoney(vip, 2000);

        System.out.println(vip.getBalance());

        Account account1 = new UsualAccount() {
            @Override
            public void addDeposit(double deposit) {
                balance += deposit*0.8;
            }
        };
        account1.addDeposit(4000);
        System.out.println(account1.getBalance());
    }
}