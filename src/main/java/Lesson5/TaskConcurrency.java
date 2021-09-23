package Lesson5;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class TaskConcurrency {
    private final int n;
    private final AtomicInteger counter;
    private static boolean mayContinue;

    public TaskConcurrency(int n) {
        if (n < 1 || n > 50) {
            throw new IllegalArgumentException("You entered: " + n + "\nExpected input from 1 to 50\n");
        }

        this.n = n;
        counter = new AtomicInteger(1);
        mayContinue = true;
        System.out.print("[");
    }

    public void land(Runnable printLand) throws InterruptedException {
        if (counter.get() % 3 == 0 & counter.get() % 5 != 0) {
            printLand.run();
            printRequiredSeparator();
            increaseCounterValueOrStopThread();
        }
    }

    public void rover(Runnable printRover) throws InterruptedException {
        if (counter.get() % 3 != 0 && counter.get() % 5 == 0) {
            printRover.run();
            printRequiredSeparator();
            increaseCounterValueOrStopThread();
        }
    }

    public void landrover(Runnable printLandRover) throws InterruptedException {
        if (counter.get() % 3 == 0 && counter.get() % 5 == 0) {
            printLandRover.run();
            printRequiredSeparator();
            increaseCounterValueOrStopThread();
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        if (counter.get() % 3 != 0 && counter.get() % 5 != 0) {
            printNumber.accept(counter.get());
            printRequiredSeparator();
            increaseCounterValueOrStopThread();
        }
    }

    private void increaseCounterValueOrStopThread() {
        if (counter.get() + 1 > n) {
            mayContinue = false;
        } else {
            counter.incrementAndGet();
        }
    }

    private void printRequiredSeparator() {
        if (counter.get() + 1 > n) {
            System.out.println("]");
        } else {
            System.out.print(", ");
        }
    }

    public static boolean isMayContinue() {
        return mayContinue;
    }
}