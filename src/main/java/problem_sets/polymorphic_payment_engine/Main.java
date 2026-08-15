package problem_sets.polymorphic_payment_engine;

public class Main {
    public static void main(String[] args) {
        PixPayment pixPayment = new PixPayment("TX-1001", 1, "7b9e4a2c-1f8d-4e3b-9a0c-2f5d8e1b3a4f");
        pixPayment.processTransaction();

        CreditCardPayment creditCardPayment = new CreditCardPayment("TX-1002", 50.2, "4756291038475621", 15000);
        creditCardPayment.processTransaction();

        BoletoPayment boletoPayment = new BoletoPayment("TX-1003", 30, "34191790010435100479100184310005191026054000001");
        boletoPayment.processTransaction();
    }
}
