package Lesson2.Task3;

import javassist.CannotCompileException;

public class ProduceOutOfMemoryException {

    public static void main(String[] args) throws Exception {
        produceException();
    }

    private static void produceException() throws CannotCompileException {
        javassist.ClassPool cp = javassist.ClassPool.getDefault();
        try {
            int counter = 1;
            while (true) {
                Class c = cp.makeClass("task3.MyClass" + counter).toClass();
                counter++;
            }
        } catch (OutOfMemoryError error) {
            System.out.println("Catch : " + error.getClass().getName());
        }
    }
}
