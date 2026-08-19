package finger_exercises.week_8;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid Age.");
        }
        System.out.println("Valid Age.");
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int age = Integer.parseInt(myObj.nextLine());

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        myObj.close();
    }
}
