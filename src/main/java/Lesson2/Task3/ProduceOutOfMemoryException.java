package Lesson2.Task3;

public class ProduceOutOfMemoryException {
    static javassist.ClassPool cp = javassist.ClassPool.getDefault();

    public static void main(String[] args) throws Exception{
        try{
            for (int i = 0; ; i++) {
                Class c = cp.makeClass("task3.MyClass" + i).toClass();
            }
        }
        catch (OutOfMemoryError ex){
            log(ex);
        }
    }
    private static void log (OutOfMemoryError ex){
        System.out.println("Catch : " + ex.getClass().getName());  /* Иногда успевает отработать */
    }
}
