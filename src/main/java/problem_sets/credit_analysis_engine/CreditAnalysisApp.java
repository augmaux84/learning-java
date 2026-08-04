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
            System.out.print("--- ITAÚ UNIBANCO --- \n1. Start simulation \n2. About the system \n3. Exit\n");
            select = myObj.nextInt();
            myObj.nextLine(); // consume Enter - remove this later

            switch (select) {
                case 1:
                    System.out.print("What is your full name? ");
                    String userName = myObj.useDelimiter("\n").next();

                    System.out.print("How old are you? ");
                    int userAge = Integer.parseInt(myObj.next());
                    if (userAge < 0 || userAge > 120) {
                        System.out.println("Validation Error: Incompatible age");
                        break; // remover this later - refactor:
                    } else { // nothing
                    }

                    System.out.print("What is your monthly income? $");
                    double userMonthlyIncome = myObj.nextDouble();
                    if (userMonthlyIncome < 0) {
                        System.out.println("Fraud attempt or typing error");
                        break;
                    } else { // nothing
                    }

                    // if String -> boolean
                    System.out.printf("%s, do you have any negative records with SPC/Serasa [true/false]? ", userName); // true/false -> y/n
                    boolean userRestriction = myObj.nextBoolean();

                    if (userRestriction) {
                        System.out.printf("%s, you have a negative credit history with Serasa/SPC and cannot access your Itaú account.\n", userName);
                    } else if (userAge < 18) {
                        System.out.printf("%s, are you an emancipated client [true/false]? ", userName); // true/false -> y/n

                        // if String -> boolean
                        boolean isEmancipatedClient = myObj.nextBoolean();

                        if (isEmancipatedClient) {
                            validation(userMonthlyIncome, userName);
                        } else {
                            System.out.printf("%s, you cannot access your Itaú account because you are under 18 and not an emancipated client.\n", userName);
                        }
                    } else {
                        validation(userMonthlyIncome, userName);
                    }

                    break;

                case 2:
                    System.out.print("...\n");
                    break;

                case 3:
                    break;
            }
                    break;
            } while (select != 3);
        }

    public static void main(String[] args) {
        menu();
    }
}