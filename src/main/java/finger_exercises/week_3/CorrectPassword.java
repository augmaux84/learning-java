package finger_exercises.week_3;

import java.util.Scanner;

public class CorrectPassword {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String correctPassword = "java";

        String password = "";
        do {
            System.out.println("Password: ");
            password = myScanner.nextLine();

        } while (!password.equalsIgnoreCase("java"));
    }
}
