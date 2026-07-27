import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void wait(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);}
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void forQuestions() {
        // fixed-size arrays
        String[] listSaints = {"St. Carlo Acutis", "St. Pier Giorgio Frassati", "St. Philip Neri", "St. John Bosco"};
        char[] listCharacters = {'A', 'B', 'C', 'D'};

        for (int i = 0; i < listSaints.length; i++) {
            System.out.println(listCharacters[i] + ") " + listSaints[i] );
        }
    }

    public static void main(String[] args) {

        /*
        int age = 17;
        double weight = 59.00;
        char K = 'K';
        char g = 'g';
        boolean isStudent = true;

        if (isStudent) {
            String student = "Augusto";
            System.out.println("Hello, " + student + "!");
            System.out.println("You are a student!");

        } else {
            String person = "Maria";
            System.out.println("You aren't a student " + person + "!");
        }
         */

        // QUIZ ABOUT YOUNG AND JOYFUL SAINTS!!!
        System.out.println("----- QUIZ ABOUT YOUNG AND JOYFUL SAINTS!!! -----");
        Scanner myObj = new Scanner(System.in);

        System.out.println("Hello, what's your name? ");
        String name = myObj.nextLine();

        // add exceptions later with try-catch structure here
        wait(2);

        System.out.println("Wow, are you " + name + "? It's a BEAUTIFUL name. Nice to meet you, my name is Augusto Maux..." );

        wait(2);

        System.out.println("Alright, now we’re going to experience the Young and Joyful Saints quiz.");

        wait(2);

        String[] listQuestions = {"The Eucharist is my highway to heaven",
                "A joyful heart is more easily made perfect than a downcast one.",
                "Education is a matter of the heart",
                "Verso l'alto"
        };

        // first question
        System.out.println("So, first question... which saint said that: '" + listQuestions[0] + "'?");
        forQuestions();

        String firstResponse = myObj.nextLine();

        if ("A".equals(firstResponse)) {
            wait(2);
            System.out.println("Yesss! You are absolutely right. St. Carlo Acutis was passionate about the Eucharist, and it was the center of his life.");
        } else {
            wait(2);
            System.out.println("Good try, but you got it wrong... Actually, the person who said that was St. Carlo Acutis, a saint devoted to the Eucharist.");
        }

        // second question
        System.out.println("Now, second question... \nWhich saint said that: '" + listQuestions[1] + "'?");
        forQuestions();

        String secondResponse = myObj.nextLine();

        if ("C".equals(secondResponse)) {
            wait(2);
            System.out.println("Woww, you're right. St. Philip Neri was very cheerful and was known as the \"Apostle of Rome\". I hope his joy is contagious to you!\n");
        } else {
            wait(2);
            System.out.println("You are wrong... but don't be sad, for St. Philip Neri was known as the Saint of Joy.");
        }

    }

}
