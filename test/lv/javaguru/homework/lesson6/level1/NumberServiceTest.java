package lv.javaguru.homework.lesson6.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Ok
class NumberServiceTest{

    private NumberService numberService;

    @BeforeEach
    void setUp() {
        numberService = new NumberService();
    }

    @Test
    void shouldReturnSumInRange() {
        int from = 2;
        int to = 6;
        int testSum = 20;

        assertEquals(testSum, numberService.sumInRange(from, to));
    }

    @Test
    void shouldReturnSumInRangeReversed() {
        int from = 6;
        int to = 2;
        int testSum = 20;

        assertEquals(testSum, numberService.sumInRange(from, to));
    }

    @Test
    void shouldGetEvenNumberCount() {
        int from = 1;
        int to = 7;
        int testCount = 3;

        assertEquals(testCount, numberService.getEvenNumberCount(from, to));
    }

    @Test
    void shouldGetEvenNumberCountRangeReversed() {
        int from = 7;
        int to = 1;
        int testCount = 3;

        assertEquals(testCount, numberService.getEvenNumberCount(from, to));
    }

}