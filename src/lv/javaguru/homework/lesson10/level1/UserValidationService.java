package lv.javaguru.homework.lesson10.level1;

public class UserValidationService{

    public static void validateUser(User user) {
        if (user.getName().length() < 3 || user.getName().length() > 15) {
            throw new ValidationException("Name must be in range from 3 to 15");
        } else if (user.getLastName().length() < 3 || user.getLastName().length() > 15) {
            throw new ValidationException("Last name must be in range from 3 to 15");
        } else if (user.getAge() < 0 || user.getAge() > 120) {
            throw new ValidationException("Age must be in range from 0 to 120");
        }

    }
}
