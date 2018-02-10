public class VIP extends Account {
    @Override
    public void addDeposit(double deposit) {
        balance += deposit*0.95;
    }
}
