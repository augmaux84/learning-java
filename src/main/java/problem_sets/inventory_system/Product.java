package problem_sets.inventory_system;

public class Product {
    private final String id;
    private final String name;
    private int stockQuantity;

    public Product(String id, String name, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void deductStock(int amount) {
        stockQuantity -= amount;
    }
}