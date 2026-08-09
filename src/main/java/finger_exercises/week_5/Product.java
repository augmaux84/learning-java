package finger_exercises.week_5;

public class Product {
    String name;
    double price;

    public static void main(String[] args) {
        Product firstProduct = new Product();
        Product secondProduct = new Product();

        firstProduct.name = "Bottle";
        firstProduct.price = 2.5;

        secondProduct.name = "Car";
        secondProduct.price = 240000;

        System.out.printf("%s : $%.2f\n", firstProduct.name, firstProduct.price);
        System.out.printf("%s : $%.2f", secondProduct.name, secondProduct.price);
    }
}
