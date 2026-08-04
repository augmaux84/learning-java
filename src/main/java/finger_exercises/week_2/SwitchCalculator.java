package finger_exercises.week_2;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("First number: ");
        double firstNumber = Double.parseDouble(myScanner.next());

        System.out.print("Second number: ");
        double secondNumber = Double.parseDouble(myScanner.next());

        // String isn't a primitive type

        System.out.print("Operation (+, -, *, /): ");
        String operation = myScanner.next();

        switch (operation) {
            case "+":
                double resultSum = firstNumber+secondNumber;
                System.out.print(resultSum);
                break;

            case "-":
                double resultSubtraction = firstNumber-secondNumber;
                System.out.print(resultSubtraction);
                break;

            case "*":
                double resultMultiplication = firstNumber*secondNumber;
                System.out.print(resultMultiplication);
                break;

            case "/":
                if (secondNumber == 0) {
                    System.out.print("Operation not accepted, as the divisor can't be 0.");
                    break;
                } else {
                    double resultDivision = firstNumber/secondNumber;
                    System.out.print(resultDivision);
                    break;
                }

            default:
                System.out.print("Operation not found.");
                break;
        }

    }
}
