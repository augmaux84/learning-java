package problem_sets.polymorphic_payment_engine;

public class BoletoPayment extends AbstractPayment{
    private final String barcode;

    public BoletoPayment(String transactionId, double amount, String barcode) {
        super(transactionId, amount);
        this.barcode = barcode;
    }

    @Override
    public boolean validate() {
        if (barcode != null && barcode.length() == 47 && amount != 0) {
            return true;
        } else {
            return false;
        }
    }
}
