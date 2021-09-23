package Lesson5.Thread;

import Lesson5.LandRover;

public class ThreadD extends Thread {
    private final LandRover landRover;

    public ThreadD(LandRover landRover) {
        this.landRover = landRover;
    }

    @Override
    public void run() {
        while (LandRover.isMayContinue()) {
            try {
                landRover.number(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

