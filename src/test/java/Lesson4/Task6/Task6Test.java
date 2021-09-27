package Lesson4.Task6;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static Lesson4.Task6.Task6.*;

public class Task6Test {

    @Test
    public void firstFunctionTest() {
        firstIntArg = 3;
        secondIntArg = 3;
        thirdIntArg = 4;

        int actualResult = firstFunction();
        int expectedResult = 76;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void secondFunctionTest() {
        firstStringArg = "first";
        secondStringArg = "second";
        thirdStringArg = "third";
        fourthStringArg = "fourth";

        String actualResult = secondFunction();
        String expectedResult = "firstTHIRDsecondFOURTH";

        Assertions.assertEquals(expectedResult, actualResult);
    }
}