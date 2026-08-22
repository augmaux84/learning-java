package finger_exercises.week_9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    public double sumNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Test
    public void sum() {
        assertEquals(8, sumNumbers(3, 5));
    }
}