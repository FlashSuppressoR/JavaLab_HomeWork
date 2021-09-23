package Lesson5;

import Lesson5.Thread.ThreadA;
import Lesson5.Thread.ThreadB;
import Lesson5.Thread.ThreadC;
import Lesson5.Thread.ThreadD;

import java.util.Scanner;

public class LandRoverRunner {

    public static void main(String[] args) {
        int yourNumb = enterNumb();
        LandRover landRover = new LandRover(yourNumb);

        Thread threadA = new ThreadA(landRover);
        Thread threadB = new ThreadB(landRover);
        Thread threadC = new ThreadC(landRover);
        Thread threadD = new ThreadD(landRover);

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }

    public static int enterNumb() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 50:");

        return scanner.nextInt();
    }
}
