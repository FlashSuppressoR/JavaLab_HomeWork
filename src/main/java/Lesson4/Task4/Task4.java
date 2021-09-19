package Lesson4.Task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a collector that evaluates the product of squares of integer numbers in a Stream<Integer>.
 * <p>
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * It will be passed as an argument to the collect() method of a stream as shown below.
 */
public class Task4 {
    public static List<Integer> numbers;

    public static void main(String[] args) {
        initList();
        System.out.println(productOfSquaresOfNumbs());
    }

    public static void initList(){
        numbers = Arrays.asList(1, 2, 3, 4);
    }

    public static Long productOfSquaresOfNumbs() {
        long val = numbers.stream().collect(Collectors.reducing(1, (a, b) -> a * b * b)); // Согласно условию
        // long val = numbers.stream().reduce(1, (a, b) -> a * b * b); Будет правильнее, если верить подсказке ИДЕ
        return val;
    }
}