package Lesson5;

import java.util.function.IntConsumer;

public class LandRover extends TaskConcurrency {
    public LandRover(int n) {
        super(n);
    }

    @Override
    public void land(Runnable printLand) throws InterruptedException {
        super.land(printLand);
    }

    @Override
    public void rover(Runnable printRover) throws InterruptedException {
        super.rover(printRover);
    }

    @Override
    public void landrover(Runnable printLandRover) throws InterruptedException {
        super.landrover(printLandRover);
    }

    @Override
    public void number(IntConsumer printNumber) throws InterruptedException {
        super.number(printNumber);
    }
}
