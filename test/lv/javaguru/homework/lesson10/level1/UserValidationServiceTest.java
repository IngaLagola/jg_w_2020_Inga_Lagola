package lv.javaguru.homework.lesson10.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Ok
class UserValidationServiceTest{

    @Test
    void shouldGetErrorWhenNameIsLestThenThree() {
        User user = new User("lo", "blabla", 10);
        try {
            UserValidationService.validateUser(user);
            fail();
        } catch (ValidationException ex) {
            assertEquals("Name must be in range from 3 to 15", ex.getMessage());
        }

    }

    @Test
    void shouldGetErrorWhenNameIsMoreThen15() {
        User user = new User("lkajhgxvxgvjhhgvccvv", "blabla", 10);
        try {
            UserValidationService.validateUser(user);
            fail();
        } catch (ValidationException ex) {
            assertEquals("Name must be in range from 3 to 15", ex.getMessage());
        }
    }

    @Test
    void shouldGetErrorWhenLastNameIsMoreThen3() { //lessThan ;)
        User user = new User("lkllllllll", "bl", 10);
        try {
            UserValidationService.validateUser(user);
            fail();
        } catch (ValidationException ex) {
            assertEquals("Last name must be in range from 3 to 15", ex.getMessage());
        }
    }

    @Test
    void shouldGetErrorWhenLastNameIsMoreThen15() {
        User user = new User("lkllllllll", "blllllllllllloty", 10);
        try {
            UserValidationService.validateUser(user);
            fail();
        } catch (ValidationException ex) {
            assertEquals("Last name must be in range from 3 to 15", ex.getMessage());
        }
    }


    @Test
    void shouldGetErrorWhenAgeIsLessThen0() {
        User user = new User("lkllllllll", "bllll", -10);
        try {
            UserValidationService.validateUser(user);
            fail();
        } catch (ValidationException ex) {
            assertEquals("Age must be in range from 0 to 120", ex.getMessage());
        }
    }


    @Test
    void shouldGetErrorWhenAgeIsMoreThen120() {
        User user = new User("lkllllllll", "bllllll", 150);
        try {
            UserValidationService.validateUser(user);
            fail();
        } catch (ValidationException ex) {
            assertEquals("Age must be in range from 0 to 120", ex.getMessage());
        }
    }

}