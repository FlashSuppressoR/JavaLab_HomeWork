package Lesson5.Thread;

import Lesson5.LandRover;

public class ThreadB extends Thread {
    private final LandRover landRover;

    public ThreadB(LandRover landRover) {
        this.landRover = landRover;
    }

    @Override
    public void run() {
        while (LandRover.isMayContinue()) {
            try {
                landRover.rover(() -> System.out.print("rover"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
