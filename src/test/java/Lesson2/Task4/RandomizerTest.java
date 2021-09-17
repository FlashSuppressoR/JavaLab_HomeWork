package Lesson2.Task4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RandomizerTest {

    @Test
    public void randomNumbGeneratorTest() {

    }

    @Test
    public void checkIngList() {
        Randomizer randomizer = new Randomizer();
        randomizer.randomNumbGenerator();
        try {
            randomizer.checkIngList();
        } catch (Exception e) {
            String catchResult = e.getClass().getName();
            String actualResult = "Lesson2.Task4.EvenNumberException";

            // ИДЕ Всегда просит поменять assertTrue на assertEquals. Надо ли?
            Assertions.assertTrue(catchResult.equals(actualResult));
        }
    }
}