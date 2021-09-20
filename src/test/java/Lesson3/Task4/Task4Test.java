package Lesson3.Task4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static Lesson3.Task4.Task4.*;
import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void factorialTest() {
        number = 3;
        long produceResult1 = factorial(number);
        long actualResult1 = 6;

        Assertions.assertEquals(produceResult1, actualResult1);

        number = 5;
        long produceResult2 = factorial(number);
        long actualResult2 = 120;

        Assertions.assertEquals(produceResult2, actualResult2);
    }
}