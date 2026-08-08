package problem_sets.shopping_cart_engine;

import java.util.ArrayList;

public class ShoppingCartEngine {
    public static void main(String[] args) {
        String[] products = {"School backpack", "Motorcycle rain cover", "Baby monitor", "Electric coffee maker", "Bed sheet set", "Thermal bottle"};
        double[] price = {17.70, 25.38, 78.49, 41.31, 19.48, 8.85};
        int[] stock = {24, 15, 7, 12, 30, 50};

        ArrayList<String> arrayListProducts = new ArrayList<>();
        ArrayList<Double> arrayListPrices = new ArrayList<>();

        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s - Price: $%.2f - Stock: %d", i+1, products[i], price[i], stock[i]);
            System.out.println();
        }

        // menu
//        do {
//
//        } while ();
    }
}
