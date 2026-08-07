package finger_exercises.week_4;

import java.util.Scanner;

public class LargestNumberArray {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a value (integer): ");
            array[i] = Integer.parseInt(myScanner.nextLine());
        }

        int largestValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestValue) {
                largestValue = array[i];
            }
        }

        System.out.println(largestValue);
    }
}
