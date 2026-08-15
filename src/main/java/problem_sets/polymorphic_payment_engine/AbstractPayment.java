package problem_sets.polymorphic_payment_engine;

public abstract class AbstractPayment implements IPayable{
    protected final String transactionId;
    protected double amount;
    protected String status = "PENDING";

    public AbstractPayment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    protected abstract boolean validate();

    @Override
    public boolean processTransaction() {
        if (!status.equalsIgnoreCase("PENDING")) {
            System.out.printf("Validation already performed. Current status: %s", status);
            return false;
        } else if (this.validate()) {
            this.status = "SUCCESS";
            return true;
        } else {
            this.status = "FAILED";
            System.out.println("Transaction processing failed: Validation error.");
            return false;
        }
    }
}