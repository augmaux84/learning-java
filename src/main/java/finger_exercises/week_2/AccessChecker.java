package finger_exercises.week_2;

import java.util.Scanner;

public class AccessChecker {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.parseInt(myScanner.next());

        System.out.print("Do you have a ticket [y/n]? ");
        String haveTicket = myScanner.next();

        if (haveTicket.equalsIgnoreCase("y") && age >= 18 && age <= 120) {
            System.out.println("You're all set—have a great party.");
        } else if (haveTicket.equalsIgnoreCase("n") && age >= 18 && age <= 120) {
            System.out.println("You don't have the ticket.");
        } else if (haveTicket.equalsIgnoreCase("y") && age < 18) {
            System.out.println("You aren't of legal age.");
        } else if (haveTicket.equalsIgnoreCase("n") && age < 18) {
            System.out.println("You don't have the ticket and aren't of legal age.");
        } else {
            System.out.println("Invalid data");
        }

    }
}
