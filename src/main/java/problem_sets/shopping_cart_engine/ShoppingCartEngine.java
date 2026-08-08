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
            System.out.println("--- MERCADO LIVRE ---");
            System.out.println("1. Add Product");
            // System.out.println("2. Complete Purchase"); // start new purchase? or exit?
            System.out.println("2. Exit");

            int index = Integer.parseInt(myObj.nextLine());

            if (index == 1) {
                for (int i = 0; i < products.length; i++) {
                    System.out.printf("%d. %s - Price: $%.2f - Stock: %d\n", i+1, products[i], price[i], stock[i]);
                }

                // while? do-while? refactor
                System.out.println("1. Add Product");


            } else if (index == 2) {
                break;
            } else {
                System.out.println("Invalid Data.");
            }
        }
    }
}
