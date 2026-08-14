package problem_sets.polymorphic_payment_engine;

public abstract class AbstractPayment implements IPayable{
    protected String transactionId;
    protected double amount;
    protected String status = "PENDING";

    protected abstract boolean validate();

    public boolean processTransaction() {
        if (!status.equalsIgnoreCase("PENDING")) {
            System.out.println("Validation already performed");
            return false;
        } else if (this.validate()) {
            this.status = "SUCCESS";
            return true;
        } else {
            this.status = "FAILED";
            System.out.println("Validation Error");
            return false;
        }
    }
}