package finger_exercises.week_6.finger_exercise_5;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Bottle");
        product.setPrice(3.5);

        Stock stock = new Stock(product, 12);
        stock.removeStock(17);
        stock.addStock(84);
        stock.removeStock(84);
        System.out.println(stock.getStock());
    }
}
