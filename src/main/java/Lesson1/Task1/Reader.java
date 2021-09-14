package Lesson1.Task1;

import java.io.*;
import java.util.*;

public class Reader {
    static List<String> wordsList = new ArrayList<>();
    static Map<String, Integer> occurrenceRepeat = new HashMap<>();
    static String text = "";

    public static void main(String[] args) {
        textReader();
        splitter(text);
        countWords();
        printer();
    }

    public static void countWords(){
        for ( String word : wordsList) {
            Integer oldCount = occurrenceRepeat.get(word);
            if ( oldCount == null ) {
                oldCount = 0;
            }
            occurrenceRepeat.put(word, oldCount + 1);
        }
    }
    public static void textReader(){
        String filePath = new File("src/main/resources/inputFileL1T1.txt").getAbsolutePath();
        File inputFile = new File(filePath);
        BufferedReader reader = null;
        try {
            reader  = new BufferedReader(new FileReader(inputFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            text = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void splitter(String text){
        String[] words = text.split(" ");
        for(String word : words){
            String checkingWord = word.replaceAll("[^a-zA-Z\\s]","");
            wordsList.add(checkingWord);
        }
    }
    public static void printer(){
        System.out.println("Различные слова из текста:\n");
        for (Map.Entry<String, Integer> word : occurrenceRepeat.entrySet()){
            System.out.println(word.getKey() + " - " + word.getValue());
        }
        System.out.println("\nКоличество различных слов в тексте: " + occurrenceRepeat.size());
    }
}
