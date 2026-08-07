package finger_exercises.week_3;

import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = Integer.parseInt(myScanner.next());

        for (int i = 1; i < number; i++) {
            if (i > 15 && i % 2 == 1) {
                break;
            }

            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
