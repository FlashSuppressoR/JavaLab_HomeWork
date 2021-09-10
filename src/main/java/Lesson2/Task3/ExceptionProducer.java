package Lesson2.Task3;

public class ExceptionProducer {
    public void produceOutOfMemoryErrorMetaspace(){
        StringBuilder s = new StringBuilder();
        System.out.println("Ожидаем OutOfMemoryError...");
        while (true) {
            s.append("JAVA");
        }
    }
}
