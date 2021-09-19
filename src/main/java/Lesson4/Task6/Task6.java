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
    static int firstIntArg = 3;
    static int secondIntArg = 3;
    static int thirdIntArg = 4;
    static String firstStringArg = "first";
    static String secondStringArg = "first";
    static String thirdStringArg = "first";
    static String fourthStringArg = "first";

    public static void main(String[] args) {
        System.out.println(firstFunction());
        System.out.println(secondFunction());
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