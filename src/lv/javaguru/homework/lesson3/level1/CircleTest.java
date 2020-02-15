package lv.javaguru.homework.lesson3.level1;

public class CircleTest{

    public static void main(String[] args) {

        Circle myCircle = new Circle();
        double radius = 10;

        myCircle.setRadius(radius);

        System.out.println("Circle with radius " + myCircle.getRadius() + " has area " + myCircle.calculateArea() );
    }
}
