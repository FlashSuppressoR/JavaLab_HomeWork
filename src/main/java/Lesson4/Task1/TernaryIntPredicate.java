package Lesson4.Task1;

@FunctionalInterface
public interface TernaryIntPredicate<Integer> {
    boolean checkIncomingValues(int a, int b, int c);
}
