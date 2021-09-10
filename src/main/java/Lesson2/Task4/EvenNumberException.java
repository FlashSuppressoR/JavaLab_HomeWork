package Lesson2.Task4;

import java.util.List;

public class EvenNumberException extends Exception{
    private int number;
    private  List<Integer> listOfNumbs;

    public int getNumber(){
        return number;
    }

    public List<Integer> getList() {
        return listOfNumbs;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public EvenNumberException(String message, List list, int numb){
        super(message);
        number = numb;
        listOfNumbs = list;
    }
}