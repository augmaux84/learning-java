package finger_exercises.week_8;

import java.util.Scanner;

public class SecureReader {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int integer;

        while (true) {
            try {
                integer = Integer.parseInt(myObj.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Unacceptable entry.");
            } finally {
                System.out.println("Reading attempt completed.");
            }
        }
    }
}
