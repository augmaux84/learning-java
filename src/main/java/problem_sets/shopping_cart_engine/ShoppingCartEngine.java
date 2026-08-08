package problem_sets.shopping_cart_engine;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ShoppingCartEngine {
    public static void wait(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);}
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

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
            System.out.println("2. Complete Purchase");
            System.out.println("3. Exit");

            int index = Integer.parseInt(myObj.nextLine().trim());

            if (index == 1) {
                System.out.println("Product Index [Integer]: ");

                int productId = Integer.parseInt(myObj.nextLine().trim()) - 1;

                if (productId < 0 || productId > products.length - 1) {
                    System.out.println("Invalid Data");
                    wait(1);
                    continue;
                } else if (stock[productId] == 0) {
                  System.out.println("Out of stock for this product");
                    wait(1);
                    continue;
                } else {
                    arrayListProducts.add(products[productId]);
                    arrayListPrices.add(price[productId]);
                    stock[productId] = stock[productId] - 1;

                    System.out.printf("%s added.", products[productId]);
                    wait(1);
                }

            } else if (index == 2) {

                if (arrayListProducts.isEmpty()) {
                    System.out.println("The cart is empty.");
                    continue;
                } else {
                    double counter = 0;
                    for (Double productPrice : arrayListPrices) {
                        counter = counter + productPrice;
                    }

                    for (int i = 0; i < arrayListProducts.size(); i++) {
                        System.out.printf("\n%s - $%.2f\n", arrayListProducts.get(i), arrayListPrices.get(i));
                    }

                    System.out.println("Total: $" + counter);
                    wait(3);
                }
            } else if (index == 3) {
                break;
            } else {
                System.out.println("Invalid Data.");
                wait(1);
            }
        }
    }
}
