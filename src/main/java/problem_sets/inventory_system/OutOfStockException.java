package problem_sets.inventory_system;

public class OutOfStockException extends Exception{
    public OutOfStockException(String message) {
        super(message);
    }
}