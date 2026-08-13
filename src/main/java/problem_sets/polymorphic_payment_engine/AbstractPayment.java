package problem_sets.polymorphic_payment_engine;

public abstract class AbstractPayment implements IPayable{
    protected String transactionId;
    protected double amount;
    protected String status = "PENDING";

    protected abstract boolean validate();

    public boolean processTransaction() {
        return false;
    }
}