package problem_sets.polymorphic_payment_engine;

import java.util.ArrayList;

public class MercadoPagoApp {
    public static void main(String[] args) {
        PixPayment p1 = new PixPayment("TX-001", 150.00, "12345678901234567890123456789012");
        PixPayment p2 = new PixPayment("TX-002", 50.00, "12345");
        CreditCardPayment c1 = new CreditCardPayment("TX-003", 2000.00, "1234567890123456", 5000.00);
        CreditCardPayment c2 = new CreditCardPayment("TX-004", 6000.00, "1234567890123456", 5000.00);
        BoletoPayment b1 = new BoletoPayment("TX-005", -10.00, "12345678901234567890123456789012345678901234567");

        ArrayList<AbstractPayment> arrayList = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(b1);

        for (AbstractPayment list : arrayList) {
            list.processTransaction();
        }
    }
}
