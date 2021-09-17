package Lesson3.Task3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * You have two IntStream. The first stream contains even numbers and the second stream contains odd numbers.
 * Create the third stream that contains numbers from both streams which is divisible by 3 and 5.
 * After calling collect(Collectors.toList()) the stream should return sorted list (ascending) of these numbers. Two first suitable numbers in the sorted list must be skipped.
 * <p>
 * Important. You need return a prepared IntStream from a template method,
 * not a list of integers. Pay attention to the method template. Do not change the signature of this method.
 * <p>
 * Sample Input 1:
 * 1 2 3 4
 * <p>
 * Sample Output 1:
 * []
 * <p>
 * Sample Input 2:
 * 30 75 60 90
 * <p>
 * Sample Output 2:
 * [75, 90]
 */
public class Task3 {
    private static final IntStream evenStream = IntStream.of(30, 60, 70, 80, 90);
    private static final IntStream oddStream = IntStream.of(1, 13, 75, 77, 99);

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        List<Integer> list = createFilteringStream(evenStream, oddStream).boxed().collect(Collectors.toList());
        System.out.println(list);
    }

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        IntStream intStream = IntStream.concat(evenStream, oddStream).filter(s -> (s % 3) == 0 && (s % 5) == 0)
                .sorted().skip(2);

        return intStream;
    }
}