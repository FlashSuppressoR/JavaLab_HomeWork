package Lesson5.Thread;

import Lesson5.LandRover;

public class ThreadA extends Thread {
    private final LandRover landRover;

    public ThreadA(LandRover landRover) {
        this.landRover = landRover;
    }

    @Override
    public void run() {
        while (LandRover.isMayContinue()) {
            try {
                landRover.land(() -> System.out.print("land"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
