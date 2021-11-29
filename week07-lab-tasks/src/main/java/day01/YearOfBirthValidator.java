package day01;

import java.time.LocalDate;

public class YearOfBirthValidator {

    public boolean validateYearOfBirth(int yearOfBirth){
        if (Math.abs(LocalDate.now().getYear() - yearOfBirth) > 120 ){
            throw new IllegalArgumentException("Invalid year!");
        }
        return true;
    }
}
