package problem_sets.inventory_system;

public class AmazonApp {
    public static void main(String[] args) throws OutOfStockException, InvalidProductException {
        InventoryManager inventoryManager = new InventoryManager();

        Product p1 = new Product("PROD-01", "Dell Notebook", 5);
        Product p2 = new Product(null, "Phantom Product", 10);

        try {
            inventoryManager.purchaseProduct(p1, 2);
        } catch (InvalidProductException i) {
            System.out.println(i.getMessage());
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Log: Transaction attempt completed.");
        }

        try {
            inventoryManager.purchaseProduct(p2, 1);
        } catch (InvalidProductException i) {
            System.out.println(i.getMessage());
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Log: Transaction attempt completed.");
        }
    }
}
