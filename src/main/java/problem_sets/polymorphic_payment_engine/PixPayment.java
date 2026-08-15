package problem_sets.polymorphic_payment_engine;

public class PixPayment extends AbstractPayment{
    String pixKey;

    public PixPayment(String transactionId, double amount, String pixKey) {
        super(transactionId, amount);
        this.pixKey = pixKey;
    }

    @Override
    public boolean validate() {
        if (this.pixKey.length() == 32) {
            return true;
        } else {
            return false;
        }
    }
}
