package Lesson2.Task4;

import java.util.ArrayList;
import java.util.List;


public class Randomizer {
    private static List<Integer> listOfNumbs = new ArrayList<>();

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
    public void start(){
        try {
            randomNumbGenerator();
        } catch (EvenNumberException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getList().toString());
            System.out.println(e.getNumber());
        }
    }
}
