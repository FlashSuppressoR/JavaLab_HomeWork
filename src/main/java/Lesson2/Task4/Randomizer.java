package Lesson2.Task4;

import java.util.ArrayList;
import java.util.List;

public class Randomizer {
    private List<Integer> listOfNumbs = new ArrayList<>();
    private final static int BOTTOM_BOUND = 1;
    private final static int UPPER_BOUND = 9;

    public void randomNumbGenerator() {
        System.out.println("Создаю три числа:");
        for (int i = 1; i <= 3; i++) {
            int numb = BOTTOM_BOUND + (int) (Math.random() * UPPER_BOUND);
            listOfNumbs.add(numb);
            System.out.println(i + " число = " + numb);
        }
    }

    public void checkIngList() throws EvenNumberException {
        for (int number : listOfNumbs) {
            if (number % 2 == 0) {
                throw new EvenNumberException("Сгенерировано чётное число!", listOfNumbs, number);
            }
        }
    }

}
