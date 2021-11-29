package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class YearOfBirthValidatorTest {
    YearOfBirthValidator yearOfBirthValidator = new YearOfBirthValidator();

    @Test
    void isYearOfBirthValidTest(){
        assertTrue(yearOfBirthValidator.validateYearOfBirth(1901));
    }

    @Test
    void isYearOfBirthValidWithWrongParamTest(){

        assertThrows(IllegalArgumentException.class, ()->yearOfBirthValidator.validateYearOfBirth(1900));
    }
}
