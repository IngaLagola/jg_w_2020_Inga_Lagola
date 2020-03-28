package lv.javaguru.homework.lesson7.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest{
    @Test
    void ShouldCreateNewArrayWithGivenSize() {
        int[] testArray;
        int testSize = 5;
        testArray = ArrayService.create(testSize);

        assertEquals(testSize, testArray.length );
    }

    @Test
    void ShouldFillArrayWithRandomNumbers() {
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        ArrayService.fillArrayWithRandomNumbers(firstArray);
        ArrayService.fillArrayWithRandomNumbers(secondArray);

        assertNotEquals(Arrays.toString(firstArray),Arrays.toString(secondArray));

    }

    @Test
    void ShouldSumInArray() {
        int[] testArray = {1,2,3,4,5};
        int testSum = 15;
        assertEquals(testSum, ArrayService.sumInArray(testArray));
    }
}