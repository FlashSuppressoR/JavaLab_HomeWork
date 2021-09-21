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
        disjunctAll(predicates);
        IntPredicate intPredicate = disjunctAll(predicates);

        System.out.println("2: " + intPredicate.test(2));
        System.out.println("3: " + intPredicate.test(3));
        System.out.println("5: " + intPredicate.test(5));
        System.out.println("7: " + intPredicate.test(7));
        System.out.println("10: " + intPredicate.test(10));
        System.out.println("15: " + intPredicate.test(15));
    }

    public static void initPredicates() {
        IntPredicate isEven = value -> value % 2 == 0;
        IntPredicate isNative = value -> value == 15;

        predicates.add(isNative);
        predicates.add(isEven);
    }

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        IntPredicate result = i -> false;
        for (IntPredicate p: predicates) {
            result = p.or(result);
        }
        return result;
    }
}