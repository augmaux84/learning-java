package finger_exercises.week_9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondCalculatorTest {
    public int doubleNumbers(int number) {
        return number * 2;
    }

    @Test
    public void testDouble() {
        assertEquals(14, doubleNumbers(7));
    }
}