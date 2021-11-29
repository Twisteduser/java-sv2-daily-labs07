package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameValidatorTest {

    NameValidator nameValidator = new NameValidator();

    @Test
    void isNameValidTest(){
        boolean result = nameValidator.validateName("John Doe");

        assertTrue(result);
    }

    @Test
    void isNameValidWithNullTest(){
        IllegalArgumentException iae= assertThrows(IllegalArgumentException.class, ()->nameValidator.validateName(null));
        assertEquals("Name is invalid!", iae.getMessage());
    }

    @Test
    void isNameValidWithWrongTest(){
        IllegalArgumentException iae= assertThrows(IllegalArgumentException.class, ()->nameValidator.validateName("John"));
        assertEquals("Name is invalid!", iae.getMessage());
    }
}
