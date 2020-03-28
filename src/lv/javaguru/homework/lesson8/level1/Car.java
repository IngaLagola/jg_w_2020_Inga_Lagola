package lv.javaguru.homework.lesson8.level1;

import java.util.Objects;

public class Car{

    protected int wheels;
    protected String color;
    protected String manufacturer;

    public Car(int wheels, String color, String manufacturer) {
        this.wheels = wheels;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels == car.wheels &&
                Objects.equals(color, car.color) &&
                Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
