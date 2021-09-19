package Lesson4.Task6;

import java.util.function.Function;

/**
 * <p>
 * Write a curried form of the function f(x,y,z)=x+y∗y+z∗z∗z using lambda expressions in Java > 8 style.
 * The result and x, y, z must be integer numbers.
 * <p>
 * Write a curried function (using lambdas) that accepts four string arguments and concatenated all in one string
 * following the rules:
 * String cases: in the result string, first and second arguments must be in lower cases and third and fourth in
 * upper cases.
 * Order of arguments concatenation: first, third, second, fourth.
 */
public class Task6 {
    static int firstIntArg;
    static int secondIntArg;
    static int thirdIntArg;
    static String firstStringArg;
    static String secondStringArg;
    static String thirdStringArg;
    static String fourthStringArg;

    public static void main(String[] args) {
        initFirstFunction();
        System.out.println(firstFunction());
        initSecondFunction();
        System.out.println(secondFunction());
    }

    public static void initFirstFunction(){
        firstIntArg = 3;
        secondIntArg = 3;
        thirdIntArg = 4;
    }

    public static void initSecondFunction(){
        firstStringArg = "first";
        secondStringArg = "second";
        thirdStringArg = "third";
        fourthStringArg = "fourth";
    }

    public static Integer firstFunction(){
        Function<Integer, Function<Integer, Function<Integer, Integer>>> function1 = x -> y -> z -> x + y * y + z * z * z;
        return function1.apply(firstIntArg).apply(secondIntArg).apply(thirdIntArg);
    }

    public static String secondFunction(){
        Function<String, Function<String, Function<String, Function<String, String>>>> function2 = a -> b -> c -> d -> new StringBuilder(a.toLowerCase())
                .append(c.toUpperCase())
                .append(b.toLowerCase())
                .append(d.toUpperCase())
                .toString();
        return function2.apply(firstStringArg).apply(secondStringArg).apply(thirdStringArg).apply(fourthStringArg);
    }
}