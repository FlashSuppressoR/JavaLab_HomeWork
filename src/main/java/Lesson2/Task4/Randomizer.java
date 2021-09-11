package Lesson2.Task4;

import java.util.ArrayList;
import java.util.List;


public class Randomizer {
    private List<Integer> listOfNumbs = new ArrayList<>();

    public void randomNumbGenerator() throws EvenNumberException{
        System.out.println("Создаю три числа:");
        for (int i = 1; i <=3; i++){
            int numb = 1 + (int) (Math.random() * 9);
            listOfNumbs.add(numb);
            System.out.println(i + " число = " + numb);
        }
        checkIngList();
    }
    public void checkIngList() throws EvenNumberException {
        for (int number : listOfNumbs) {
            if (number % 2 == 0) {
                throw new EvenNumberException("Сгенерировано чётное число!", listOfNumbs, number);
            }
        }
    }

}
