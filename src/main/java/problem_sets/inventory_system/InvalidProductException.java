package problem_sets.inventory_system;

public class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}