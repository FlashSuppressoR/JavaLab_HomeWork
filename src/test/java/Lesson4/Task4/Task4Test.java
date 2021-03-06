package Lesson4.Task4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;

public class Task4Test {

    @Test
    public void productOfSquaresOfNumbsTest() {
        Task4.numbers = Arrays.asList(1, 2, 3, 4);

        long actualResult = Task4.productOfSquaresOfNumbs();
        long expectedResult = 576L;

        Assertions.assertEquals(expectedResult, actualResult);
    }
}