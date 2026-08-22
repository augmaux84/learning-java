package finger_exercises.week_9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PasswordValidatorTest {
    public boolean validator(String password) throws IllegalArgumentException{
        if (password == null) {
            throw new IllegalArgumentException("Error");
        }

        return password.length() >= 8; // true or false
    }

    @Test
    public void testValidator() {
        Assertions.assertTrue(validator("a1290swz"));
        Assertions.assertFalse(validator("a84swz"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            validator(null);
        });
    }
}
