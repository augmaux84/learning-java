package finger_exercises.week_2;

import java.util.Scanner;

public class SystemAccess {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // attention: these are test data
        String correctUser = "admin";
        String correctPassword = "java123";

        System.out.print("Name: ");
        String name = myScanner.next();

        System.out.print("Password: ");
        String password = myScanner.next();

        if (name.equalsIgnoreCase(correctUser) && password.equals(correctPassword)) {
            System.out.println("Access allowed!");
        } else {
            System.out.println("Access not allowed...");
        }
    }
}
