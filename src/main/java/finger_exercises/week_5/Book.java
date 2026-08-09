package finger_exercises.week_5;

public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public static void main(String[] args) {
        Book firstBook = new Book("Vidas Secas", "Graciliano Ramos", 134);
        Book secondBook = new Book("Noites Brancas", "Fiódor Dostoiévski", 79);

        System.out.printf("%s - %s - %d\n", firstBook.title, firstBook.author, firstBook.pages);
        System.out.printf("%s - %s - %d\n", secondBook.title, secondBook.author, secondBook.pages);
    }
}
