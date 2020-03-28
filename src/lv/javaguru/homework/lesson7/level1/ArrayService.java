package lv.javaguru.homework.lesson7.level1;

import java.util.Random;

public class ArrayService{

    public static int[] create(int size) {
        return new int[size];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public static void printArrayToConsole(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        for (int number : array) {
            System.out.println(number);
        }
    }

    public static int sumInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
