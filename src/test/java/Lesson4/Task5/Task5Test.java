package Lesson4.Task5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static Lesson4.Task5.Task5.*;

public class Task5Test {

    @Test
    public void palindromeDetectedTest() {
        words = new String[]{"aaa", "loop", "pool", "noon"};
        palindromeDetected();
        List<String> falseList = palindromeOrNoMap.get(false);
        List<String> trueList = palindromeOrNoMap.get(true);

        String actualFalseResult1 = falseList.get(0);
        String actualFalseResult2 = falseList.get(1);
        String actualTrueResult1 = trueList.get(0);
        String actualTrueResult2 = trueList.get(1);
        String expectedFalseResult1 = "loop";
        String expectedFalseResult2 = "pool";
        String expectedTrueResult1 = "aaa";
        String expectedTrueResult2 = "noon";

        Assertions.assertEquals(expectedFalseResult1, actualFalseResult1);
        Assertions.assertEquals(expectedFalseResult2, actualFalseResult2);
        Assertions.assertEquals(expectedTrueResult1, actualTrueResult1);
            Assertions.assertEquals(expectedTrueResult2, actualTrueResult2);
    }
}