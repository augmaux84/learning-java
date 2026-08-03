package finger_exercises.week_1;

import java.util.Scanner;

public class ProductSpecifications {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Product name: ");
        String productName = myScanner.next();

        System.out.print("Product price: ");
        double productPrice = Double.parseDouble(myScanner.next());

        System.out.print("Quantity of products: ");
        int productQuantity = Integer.parseInt(myScanner.next());

        System.out.print("Is the product available [true/false]?: ");
        String productAvailable = (myScanner.next());

        // System.out.println("Product name: " + productName + "\nProduct price: $" + productPrice + "\nQuantity of products: " + productQuantity + "\nIs the product available? " + productAvailable);

        if (productAvailable.equalsIgnoreCase("true") || productAvailable.equalsIgnoreCase("false")) {
            boolean productAvailableBoolean = Boolean.parseBoolean(productAvailable);
            if (productAvailableBoolean) {
                System.out.printf("Product name: %s\nProduct price: $%.2f\nQuantity of products: %d\nIs the product available? Yes", productName, productPrice, productQuantity);
            } else {
                System.out.printf("Product name: %s\nProduct price: $%.2f\nQuantity of products: %d\nIs the product available? No", productName, productPrice, productQuantity);
            }
        }
        else {
            System.out.println("Answer not accepted");
        }

        // exceptions here with else-if
    }
}
