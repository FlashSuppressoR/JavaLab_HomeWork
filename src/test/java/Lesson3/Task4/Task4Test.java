package Lesson3.Task4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static Lesson3.Task4.Task4.*;

public class Task4Test {

    @Test
    public void factorialTest() {
        long produceResult1 = getFactorial(3);
        long actualResult1 = 6;

        Assertions.assertEquals(produceResult1, actualResult1);

        long produceResult2 = getFactorial(5);
        long actualResult2 = 120;

        Assertions.assertEquals(produceResult2, actualResult2);
    }
}