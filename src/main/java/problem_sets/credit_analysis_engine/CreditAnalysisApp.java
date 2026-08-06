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
            // myObj.nextLine(); // consume Enter - remove this later

            switch (select) {
                case 1:

                    boolean validData = true;

                    do {
                        System.out.print("What is your full name? ");
                        String userName = myObj.useDelimiter("\n").next();

                        System.out.print("How old are you? ");
                        int userAge = Integer.parseInt(myObj.next());
                        if (userAge < 0 || userAge > 120) {
                            System.out.println("Validation Error: Incompatible age");
                            break;
                        }

                        System.out.print("What is your monthly income? $");
                        double userMonthlyIncome = Double.parseDouble(myObj.next());
                        if (userMonthlyIncome < 0) {
                            System.out.println("Fraud attempt or typing error");
                            break;
                        }

                        System.out.printf("%s, do you have any negative records with SPC/Serasa [y/n]? ", userName); // true/false -> y/n
                        boolean userRestriction = Boolean.parseBoolean(myObj.next());
                        // boolean userRestriction = Boolean.parseBoolean(myObj.next());

                        if (userRestriction) {
                            System.out.printf("%s, you have a negative credit history with Serasa/SPC and cannot access your Itaú account.\n", userName);
                            break;
                        }

                        if (userAge < 18) {
                            System.out.printf("%s, are you an emancipated client [true/false]? ", userName); // true/false -> y/n
                            // if String -> boolean
                            boolean isEmancipatedClient = myObj.nextBoolean();

                            if (!isEmancipatedClient) {
                                System.out.printf("%s, you cannot access your Itaú account because you are under 18 and not an emancipated client.\n", userName);
                                break;
                            } else {
                                validation(userMonthlyIncome, userName); // error
                                break;
                            }
                        }
                        validation(userMonthlyIncome, userName);
                        break;

                    } while (validData);

                    break;
                // myObj.reset();
                case 2:
                    System.out.print("We are the largest Brazilian private bank by market value—valued at US$ 8.6 billion according to Brand Finance’s 2025 \"Brazil 100\" ranking. \nWith an extensive product portfolio and through our brands and commercial partnerships, we offer a wide range of services across multiple channels, operating as a full-service, universal bank.\n");
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid data.");

            }
        } while (select != 3);
    }
    public static void main(String[] args){
        menu();
    }
}