package Lesson2.Task4;

import java.util.List;

public class EvenNumberException extends Exception {
    private int number;
    private List<Integer> listOfNumbs;

    public int getNumber() {
        return number;
    }

    public List<Integer> getList() {
        return listOfNumbs;
    }

    public EvenNumberException(String message, List<Integer> list, int numb) {
        super(message);
        number = numb;
        listOfNumbs = list;
    }
}