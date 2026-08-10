package finger_exercises.week_6.finger_exercise_2;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Bottle");
        product.setPrice(20);
        System.out.println(product.getName());
        System.out.printf("$%.2f", product.getPrice());
    }
}