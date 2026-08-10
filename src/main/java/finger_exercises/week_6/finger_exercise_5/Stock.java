package finger_exercises.week_6.finger_exercise_5;

public class Stock {
    private Product product;
    private int stock;

    public Stock(Product product, int stock) {
        this.product = product;
        this.stock = stock;
    }

    public void addStock(int unit) {
        this.stock = this.stock + unit;
    }

    public void removeStock(int unit) {
        if (unit > this.stock) {
            System.out.println("Invalid Unit.");
        } else {
            this.stock = this.stock - unit;
        }
    }

    public int getStock() {
        return this.stock;
    }

}
