package finger_exercises.week_2;

import java.util.Scanner;

public class AgeMajority {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.parseInt(myScanner.next());

        if (age >= 18 && age <= 120) {
            System.out.printf("You are of legal age, as you are %d years old.", age);
        } else if (age < 18 && age >= 0) {
            System.out.printf("You are a minor, as you are %d years old.", age);
        } else {
            System.out.println("Invalid age.");
        }
    }
}
