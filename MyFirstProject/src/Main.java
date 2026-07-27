import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void wait(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);}
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
        Scanner myObj = new Scanner(System.in);
        String[] listQuestions = {"The Eucharist is my highway to heaven",
                "A joyful heart is more easily made perfect than a downcast one.",
                "Education is a matter of the heart",
                "Verso l'alto"
        };
        // QUIZ ABOUT YOUNG AND JOYFUL SAINTS!!!
        System.out.println("----- QUIZ ABOUT YOUNG AND JOYFUL SAINTS!!! -----");

        System.out.print("Hello, what's your name? ");
        String name = myObj.next();

        // add int age here

        // add exceptions later with try-catch structure here
        wait(2);

        System.out.println("Wow, are you " + name + "? It's a BEAUTIFUL name. Nice to meet you, my name is Augusto Maux..." );

        wait(2);

        System.out.println("Alright, now we’re going to experience the Young and Joyful Saints quiz.");

        wait(2);

        // first question
        wait(2);
        System.out.println("So, first question... \nwhich saint said that: '" + listQuestions[0] + "'?");
        forQuestions();

        System.out.print("Your response: ");
        String firstResponse = myObj.next();

        if ("A".equals(firstResponse)) {
            wait(2);
            System.out.println("Yesss! You are absolutely right. St. Carlo Acutis was passionate about the Eucharist, and it was the center of his life.");
        } else {
            wait(2);
            System.out.println("Good try, but you got it wrong... Actually, the person who said that was St. Carlo Acutis, a saint devoted to the Eucharist.");
        }

        // second question
        wait(2);
        System.out.println("Now, second question... \nWhich saint said that: '" + listQuestions[1] + "'?");
        forQuestions();

        System.out.print("Your response: ");
        String secondResponse = myObj.next();

        if ("C".equals(secondResponse)) {
            wait(2);
            System.out.println("Woww, you're right. St. Philip Neri was very cheerful and was known as the \"Apostle of Rome\". I hope his joy is contagious to you!\n");
        } else {
            wait(2);
            System.out.println("You are wrong... but don't be sad, for St. Philip Neri was known as the Saint of Joy.");
        }

        // third question
        wait(2);
        System.out.println("Third question already? Wow, we're moving fast! Alright, here goes: \nWhich saint said that: '" + listQuestions[2] + "'?");
        forQuestions();

        System.out.print("Your response: ");
        String thirdResponse = myObj.next();

        if ("D".equals(thirdResponse)) {
            wait(2);
            System.out.println("Ooh! You're right! St. John Bosco (Dom Bosco) loves young people very much and used to say these words.");
        } else {
            wait(2);
            System.out.println("Oh no... Actually, that phrase was from Saint John Bosco, a saint who loved young people and valued their education.");
        }

        // fourth question
        wait(2);
        System.out.println("Fourth question... \nWhich saint said that: '" + listQuestions[3] + "'?");
        forQuestions();

        System.out.print("Your response: ");
        String fourthResponse = myObj.next();

        if ("B".equals(fourthResponse)) {
            wait(2);
            System.out.println("Sì, mio giovane amico, sì. You're absolutely right. St. Pier Giorgio Frassati had this motto: 'Verso l'alto'!");
        } else {
            wait(2);
            System.out.println("Oh no... You're wrong... Actually, it was St. Pier Giorgio Frassati who said that.");
        }
    }

}
