package Lesson3.Task5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static Lesson3.Task5.Task5.*;
import static org.junit.Assert.*;

public class Task5Test {

    @Test
    public void sumOfOddNumbersInRangeTest() {
        start = 2;
        end = 25;

        long produceResult = sumOfOddNumbersInRange(start, end);
        long actualResult = 168;

        Assertions.assertEquals(produceResult, actualResult);
    }
}