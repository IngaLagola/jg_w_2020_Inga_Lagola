package lv.javaguru.homework.lesson3.level1;

public class Circle{

    private double radius;

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}