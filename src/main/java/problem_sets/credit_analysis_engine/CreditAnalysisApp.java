package problem_sets.credit_analysis_engine;

import java.util.Scanner;

public class CreditAnalysisApp {

    public static void validation(Double userMonthlyIncome, String userName) {
        if (userMonthlyIncome >= 15000) {
            System.out.printf("Hello, %s! Itaú Personnalité account activated!\n", userName);
        } else if (userMonthlyIncome >= 5000) {
            System.out.printf("Hello, %s! Itaú Uniclass account activated!\n", userName);
        } else {
            System.out.printf("Hello, %s! Itaú Varejo account activated!\n", userName);
        }
    }

    public static void menu() {
        Scanner myObj = new Scanner(System.in);

        int select;

        do {
            System.out.print("--- ITAÚ BANK --- \n1. Start simulation \n2. About the system \n3. Exit\n");
            select = myObj.nextInt();

            // continue with switch-case and while
            switch (select) {
                case 1:
                    System.out.print("What is your full name? ");
                    String userName = myObj.next();

                    System.out.print("How old are you? ");
                    int userAge = Integer.parseInt(myObj.next());
                    // edge case - impossible age

                    System.out.print("What is your monthly income? $");
                    double userMonthlyIncome = myObj.nextDouble();
                    // edge case - negative income

                    // if String -> boolean
                    System.out.printf("%s, do you have any negative records with SPC/Serasa [true/false]? ", userName); // true/false -> y/n
                    boolean userRestriction = myObj.nextBoolean();

                    if (!userRestriction && (userAge >= 18)) {
                        validation(userMonthlyIncome, userName);
                    } else if (userRestriction) {
                        System.out.printf("%s, you have a negative credit history with Serasa/SPC and cannot access your Itaú account.\n", userName);
                    } else { // refactor using userAge >= 18 || isEmancipatedClient
                        System.out.printf("%s, are you an emancipated client [true/false]? ", userName); // true/false -> y/n

                        // if String -> boolean
                        boolean isEmancipatedClient = myObj.nextBoolean();

                        if (isEmancipatedClient) {
                            validation(userMonthlyIncome, userName);
                        } else {
                            System.out.printf("%s, you cannot access your Itaú account because you are under 18 and not an emancipated client.\n", userName);
                        }
                    }
                    break;
                case 2:
                    System.out.print("...\n");

                case 3:
                    break;
                }
            } while (select != 3);
        }

    public static void main(String[] args) {
        menu();
    }
}