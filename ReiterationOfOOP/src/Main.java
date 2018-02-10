/**
 * @author Dmitrii "BinaryArchaism" Dmitriev
 */

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.addDeposit(3000);
        Account vip = new VIP();
        vip.addDeposit(3000);
        System.out.println(account.getBalance()+ "\n" + vip.getBalance());
    }
}