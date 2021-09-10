package Lesson2.Task3;

public class ExceptionHandler {
    public void execute(){
        ExceptionProducer exceptionProducer = new ExceptionProducer();
        catchOutOfMemoryErrorMetaspace(exceptionProducer);
    }
    private void catchOutOfMemoryErrorMetaspace(ExceptionProducer producer){
        try{
            producer.produceOutOfMemoryErrorMetaspace();
        }
        catch (OutOfMemoryError ex){
            log(ex);
        }
    }
    private void log(Object ex){
        System.out.println("Catch: " + ex.getClass().getName());
    }
}
