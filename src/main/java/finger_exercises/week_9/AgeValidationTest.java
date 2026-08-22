package finger_exercises.week_9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeValidationTest {
    public boolean validator(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testValidator() {
        assertEquals(true, validator(19));
        assertEquals(false, validator(2));
    }
}
