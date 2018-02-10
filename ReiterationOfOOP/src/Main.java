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
    }
}