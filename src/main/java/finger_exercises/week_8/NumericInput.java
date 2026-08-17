package finger_exercises.week_8;

import java.util.Scanner;

public class NumericInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String stringNumber = myObj.nextLine();
        try {
            int integerNumber = Integer.parseInt(stringNumber);
            System.out.printf("Accepted entry - number: %d", integerNumber);
        } catch (NumberFormatException e) {
            System.out.println("Unacceptable entry");
        }

        myObj.close();
    }
}
