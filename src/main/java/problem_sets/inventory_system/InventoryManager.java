package problem_sets.inventory_system;

public class InventoryManager {
    public void purchaseProduct(Product product, int quantity) throws InvalidProductException, OutOfStockException {
        if (product == null || product.getId() == null) {
            throw new InvalidProductException("Error: Invalid product or not found in the catalog.");
        } else if (quantity > product.getStockQuantity()) {
            throw new OutOfStockException("Error: Insufficient stock. Available units: " + product.getStockQuantity());
        } else {
            product.deductStock(quantity);
            System.out.printf("Purchase of product %s approved! New stock: %d", product.getName(), product.getStockQuantity());
        }
    }
}
