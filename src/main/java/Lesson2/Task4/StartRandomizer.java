package Lesson2.Task4;

public class StartRandomizer {
    public static void main(String[] args) {
        start();
        finish();
    }
    public static void start(){
        try {
            Randomizer randomizer = new Randomizer();
            randomizer.randomNumbGenerator();
            randomizer.checkIngList();
        }
        catch (EvenNumberException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getList().toString());
            System.out.println(e.getNumber() + " - нас не устраивает!\nПробую ещё раз...\n");
            start();
        }
    }
    public static void finish(){
        System.out.println("Три числа сгенерированы успешно!");
    }
}
