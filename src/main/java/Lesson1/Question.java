package Lesson1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Вопрос по компаратору с лекции:
public class Question {
    public static void main(String[] args) {
        Set<String> value = new TreeSet<>(new StringLengthComparator());
        Set<String> value1 = new HashSet<>();
        initSet(value);
        initSet(value1);
        System.out.println("Вывод для ТриСэт'a с компаратором:");
        System.out.println(value);
        System.out.println("\nВывод для ХэшСэт'а без аргументов:");
        System.out.println(value1);
    }
    public static void initSet(Set value){
        value.add("first");
        value.add("first");
        value.add("pp");
        value.add("second");
        value.add("test");
        value.add("third");
        value.add("fifth");
    }
    private static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return CharSequence.compare(o1, o2); /* Сортировка в алфавитном порядке (уникальность по equals) */
//            return Integer.compare(o1.length(), o2.length()); /* Сортировка по длине  */
//            return Integer.compare(o1.length(), o2.length()); /* Сортировка по длине (уникальность по длине) */
        }
    }
//    Вывод для ТриСэт'a с компаратором:
//            [fifth, first, pp, second, test, third]
//    Вывод для ТриСэт'a с компаратором по длине:
//            [pp, test, first, second]
//    Вывод для ХэшСэт'а без аргументов:
//            [pp, test, third, fifth, first, second]
}
