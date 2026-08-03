package finger_exercises.week_1;

import java.util.Scanner;

public class SimplePurchases {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Product name: ");
        String productName = myScanner.next();

        System.out.print("Price (R$): ");
        double productPrice = Double.parseDouble(myScanner.next());

        System.out.print("Quantity: ");
        double productQuantity= Double.parseDouble(myScanner.next());

        double productAmount = (productPrice*productQuantity);
        System.out.printf("Amount: R$%.2f", productAmount);
    }
}
