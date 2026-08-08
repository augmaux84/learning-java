package finger_exercises.week_4;

import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>(5);

        int i = 0;
        do {
            System.out.println("Enter a text: ");
            shoppingList.add(myScanner.nextLine());
            i++;
        } while (i != 5);

        for (i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
    }
}
