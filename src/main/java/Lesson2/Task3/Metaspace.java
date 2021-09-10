package Lesson2.Task3;

public class Metaspace {

    public static void main(String[] args) {
        executeExceptionHandler();

    }
    private static void executeExceptionHandler(){
        ExceptionHandler handler = new ExceptionHandler();
        handler.execute();
    }
}
