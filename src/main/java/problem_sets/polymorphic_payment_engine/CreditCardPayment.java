package problem_sets.polymorphic_payment_engine;

public class CreditCardPayment extends AbstractPayment{
    private final String cardNumber;
    private double cardLimit;

    public CreditCardPayment(String transactionId, double amount, String cardNumber, double cardLimit) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
        this.cardLimit = cardLimit;
    }

    @Override
    public boolean validate() {
        if ((this.cardNumber != null && this.cardNumber.length() == 16) && (amount != 0 && this.amount <= this.cardLimit)) {
            return true;
        } else {
            return false;
        }
    }
}
