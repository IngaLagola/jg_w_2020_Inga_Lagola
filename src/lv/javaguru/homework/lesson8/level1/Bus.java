package lv.javaguru.homework.lesson8.level1;

import java.util.Objects;

public class Bus extends Car{

    protected int standingPlacesInBus;

    public Bus(int wheels, String color, String manufacturer, int standingPlacesInBus) {
        super(wheels, color, manufacturer);
        this.standingPlacesInBus = standingPlacesInBus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return standingPlacesInBus == bus.standingPlacesInBus;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "standingPlacesInBus=" + standingPlacesInBus +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
