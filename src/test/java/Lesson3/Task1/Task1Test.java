package Lesson3.Task1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static Lesson3.Task1.Task1.*;


public class Task1Test {

    @Test
    public void isPrimeTest() {
        number = 2;
        Assertions.assertTrue(isPrime(number));
        number = 3;
        Assertions.assertTrue(isPrime(number));
        number = 4;
        Assertions.assertFalse(isPrime(number));
        number = 41;
        Assertions.assertTrue(isPrime(number));
        number = 62;
        Assertions.assertFalse(isPrime(number));
        number = 67;
        Assertions.assertTrue(isPrime(number));
        number = 91;
        Assertions.assertFalse(isPrime(number));
    }
}