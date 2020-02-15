package lv.javaguru.homework.lesson2.level2;

import java.util.Random;

public class RandomNumbersServiceTest{
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int firstNumber = randomGenerator.nextInt(10);
        int secondNumber = randomGenerator.nextInt(5);
        int thirdNumber = randomGenerator.nextInt(3);
        int sumResult = firstNumber + secondNumber + thirdNumber;

        System.out.println(sumResult);
    }
}
