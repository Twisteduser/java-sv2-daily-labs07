package day01;

import java.time.LocalDate;

public class Human {
    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        NameValidator nameValidator = new NameValidator();
        YearOfBirthValidator yearOfBirthValidator = new YearOfBirthValidator();
        if (yearOfBirthValidator.validateYearOfBirth(yearOfBirth) && nameValidator.validateName(name) ) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }


    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
