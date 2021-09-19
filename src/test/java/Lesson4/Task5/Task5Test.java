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

        String produceFalseResult1 = falseList.get(0);
        String produceFalseResult2 = falseList.get(1);
        String produceTrueResult1 = trueList.get(0);
        String produceTrueResult2 = trueList.get(1);
        String actualFalseResult1 = "loop";
        String actualFalseResult2 = "pool";
        String actualTrueResult1 = "aaa";
        String actualTrueResult2 = "noon";

        Assertions.assertEquals(produceFalseResult1, actualFalseResult1);
        Assertions.assertEquals(produceFalseResult2, actualFalseResult2);
        Assertions.assertEquals(produceTrueResult1, actualTrueResult1);
        Assertions.assertEquals(produceTrueResult2, actualTrueResult2);
    }
}