package lv.javaguru.homework.lesson3.level2;

//šis imports nav izmantots - dzēst
import java.awt.*;

//Ok
public class CarTest{
    public static void main(String[] args) {

        Car myCar = new Car();

        String color = "Black";
        String manufacturer = "Toyota";
        int year = 2013;

        myCar.setColor(color);
        myCar.setManufacturer(manufacturer);
        myCar.setYear(year);

        System.out.println("My car is " + myCar.getColor());
        System.out.println("My car manufacturer is " + myCar.getManufacturer());
        System.out.println("My car is " + myCar.getYear());
    }
}
