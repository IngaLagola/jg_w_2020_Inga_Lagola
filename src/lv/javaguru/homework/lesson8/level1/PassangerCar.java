package lv.javaguru.homework.lesson8.level1;

//dzēs neizmanotu importu
import java.util.Objects;

//izmanto "ctrl + alt + l"
public class PassangerCar extends Car{ //gramatikas kļūda klases nosaukumā

    protected boolean gearBox; //šis ir savāds stāvoklis, drošvien gribēji "manual" vai "auto" - tam vareji izmantot enumu

    public PassangerCar(int wheels, String color, String manufacturer, boolean gearBox) {
        super(wheels, color, manufacturer);
        this.gearBox = gearBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassangerCar that = (PassangerCar) o;
        return gearBox == that.gearBox;
    }

    @Override
    public String toString() {
        return "PassangerCar{" +
                "gearBox=" + gearBox +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}