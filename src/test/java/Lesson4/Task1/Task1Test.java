package Lesson4.Task1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task1Test {

    @Test
    public void checkAllValuesAreDifferentPredicateTestTrue() {
        Task1.a = 1;
        Task1.b = 2;
        Task1.c = 3;

        Assertions.assertTrue(Task1.checkAllValuesAreDifferentPredicate());
    }
    @Test
    public void checkAllValuesAreDifferentPredicateTestFalse() {
        Task1.a = 1;
        Task1.b = 1;
        Task1.c = 1;

        Assertions.assertFalse(Task1.checkAllValuesAreDifferentPredicate());
    }
}