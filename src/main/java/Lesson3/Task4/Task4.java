package Lesson3.Task4;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * Many java developers wrote methods to calculate a factorial value using a
 * recursive or iterative algorithm. It's time to do it with streams.
 * <p>
 * The factorial of n is calculated by the product of integer number from 1 to n (inclusive).
 * The factorial of 0 is equal to 1.
 * <p>
 * Important. Use the given template for your factorial method.
 * Pay attention to type of an argument and the returned value. Please, don't use cycles or recursion.
 * <p>
 * Sample Input 1:
 * 0
 * <p>
 * Sample Output 1:
 * 1
 * <p>
 * Sample Input 2:
 * 1
 * <p>
 * Sample Output 2:
 * 1
 * <p>
 * Sample Input 3:
 * 2
 * <p>
 * Sample Output 3:
 * 2
 */
public class Task4 {
    /**
     * Calculates the factorial of the given number n
     *
     * @param n >= 0
     * @return factorial value
     */
    static long number;

    public static void main(String[] args) {
        start();
        System.out.println("factorial value = " + factorial(number));
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        number = scanner.nextInt();
    }

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        return LongStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
    }
}