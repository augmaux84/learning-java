package finger_exercises.week_4;

import java.util.Scanner;

public class SearchName {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a name: ");

            array[i] = myScanner.nextLine();
        }

        System.out.println("Enter a name: ");
        String name = myScanner.nextLine();

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (name.equalsIgnoreCase(array[i])) {
                counter++;
            } else {
                continue;
            }
        }

        if (counter == 0) {
            System.out.println("The name was not found in the array.");
        } else {
            System.out.printf("The name was found %d time(s) in the array.", counter);
        }
    }
}
