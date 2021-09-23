package Lesson5.Thread;

import Lesson5.LandRover;

public class ThreadC extends Thread {
    private final LandRover landRover;

    public ThreadC(LandRover landRover) {
        this.landRover = landRover;
    }

    @Override
    public void run() {
        while (LandRover.isMayContinue()) {
            try {
                landRover.landrover(() -> System.out.print("landRover"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

