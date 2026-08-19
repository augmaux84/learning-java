package finger_exercises.week_8;

import java.util.Scanner;

public class InvalidAgeException {

    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid Age.");
        }
        System.out.println("Valid Age.");
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int age = Integer.parseInt(myObj.nextLine());

        try {
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        myObj.close();
    }
}
