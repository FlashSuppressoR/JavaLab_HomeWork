package Lesson4.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.LongStream;

/**
 * Write the disjunctAll method that accepts a list of
 * IntPredicate's and returns a single IntPredicate.
 * The result predicate is a disjunction of all input predicates.
 * <p>
 * If the input list is empty then the result predicate should
 * return false for any integer value (always false).
 */
public class Task2 {
    /**
     * The method represents a disjunct operator for a list of predicates.
     * For an empty list it returns the always false predicate.
     */

    static List<IntPredicate> predicates = new ArrayList<>();

    public static void main(String[] args) {
        initPredicates();

        System.out.println(disjunctAll(predicates).getClass().getName());
    }

    public static void initPredicates() {
        IntPredicate isEven = value -> value % 2 == 0;
        IntPredicate isNative = value -> LongStream.rangeClosed(2, value / 2).noneMatch(i -> value % i == 0);

        predicates.add(isNative);
        predicates.add(isEven);
    }

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        IntPredicate predicate = predicates.get(0);
        for (int i = 1; i < predicates.size(); i++) {
            predicate = predicate.or(predicates.get(i));

        }
        return predicate;
    }
}