package Lesson4.Task1;

import java.util.Scanner;

/**
 * You need to write your own functional interface (TernaryIntPredicate) and use it with a
 * lambda expression.
 * The interface must have a single non-static (and non-default) method test with
 * three int arguments that returns boolean value.
 * Besides, you need to write a lambda expression with three int arguments using your
 * TernaryIntPredicate.
 * <p>
 * The lambda expression has to return true if all passed values are different otherwise false. The name of the instance is allValuesAreDifferentPredicate. It should be a static field.
 * <p>
 * Sample Input 1:
 * 1 1 1
 * <p>
 * Sample Output 1:
 * False
 * <p>
 * Sample Input 2:
 * 2 3 4
 * <p>
 * Sample Output 2:
 * True
 */

public class Task1 {
    static int a;
    static int b;
    static int c;
    static boolean allValuesAreDifferentPredicate;

    public static void main(String[] args) {
        scan3Numbers();
        System.out.println("\n" + checkAllValuesAreDifferentPredicate());
    }

    public static void scan3Numbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = scanner.nextInt();
        System.out.println("Enter second number:");
        b = scanner.nextInt();
        System.out.println("Enter third number:");
        c = scanner.nextInt();
        scanner.close();
    }

    public static boolean checkAllValuesAreDifferentPredicate() {
        TernaryIntPredicate<Integer> ternaryIntPredicate = (a1, b1, c1) -> a != b & a != c & b != c;

        return allValuesAreDifferentPredicate = ternaryIntPredicate.checkIncomingValues(a, b, c);
    }
}

