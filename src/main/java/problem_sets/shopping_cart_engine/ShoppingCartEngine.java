package problem_sets.shopping_cart_engine;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartEngine {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String[] products = {"School backpack", "Motorcycle rain cover", "Baby monitor", "Electric coffee maker", "Bed sheet set", "Thermal bottle"};
        double[] price = {17.70, 25.38, 78.49, 41.31, 19.48, 8.85};
        int[] stock = {24, 15, 7, 12, 30, 50};

        ArrayList<String> arrayListProducts = new ArrayList<>();
        ArrayList<Double> arrayListPrices = new ArrayList<>();

        // menu
        while (true) {
            System.out.println("\n--- MERCADO LIVRE ---\n");

            for (int i = 0; i < products.length; i++) {
                System.out.printf("%d. %s - Price: $%.2f - Stock: %d\n", i + 1, products[i], price[i], stock[i]);
            }

            System.out.println("\n1. Add Product");
            System.out.println("2. Complete Purchase"); // and what if there are no products in the cart?
            System.out.println("3. Exit");

            int index = Integer.parseInt(myObj.nextLine().trim());

            if (index == 1) {
                System.out.println("Product Index [Integer]: ");
                int productId = Integer.parseInt(myObj.nextLine().trim()) - 1;

                arrayListProducts.add(products[productId]);
                arrayListPrices.add(price[productId]);
                stock[productId] = stock[productId] - 1;

                System.out.printf("%s added.", products[productId]);
            } else if (index == 2) {
                // then: forEach
                double counter = 0;
                for (int i = 0; i < arrayListPrices.size(); i++) {
                    counter = counter + arrayListPrices.get(i);
                }

                // final receipt - use 2x, 3x, etc
                for (int i = 0; i < arrayListProducts.size(); i++) {
                    System.out.printf("\n%s - $%.2f\n", arrayListProducts.get(i), arrayListPrices.get(i));
                }

                System.out.println("Total: $" + counter);
            } else if (index == 3) {
                break;
            }
        }
    }
}
