package finger_exercises.week_9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {
    public double convertToFahrenheit(double number) {
        return number * ((double) 9/5) + 32;
    }

    @Test
    public void testConvert() {
        assertEquals(32, convertToFahrenheit(0));
        assertEquals(212, convertToFahrenheit(100));
    }
}
