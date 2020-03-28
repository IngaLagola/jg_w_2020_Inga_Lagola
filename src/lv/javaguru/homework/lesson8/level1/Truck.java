package lv.javaguru.homework.lesson8.level1;

import java.util.Objects;

public class Truck extends Car{

    protected int cargo;

    public Truck(int wheels, String color, String manufacturer, int cargo) {
        super(wheels, color, manufacturer);
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return cargo == truck.cargo;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cargo=" + cargo +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

