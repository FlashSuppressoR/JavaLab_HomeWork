package Lesson1;

import java.io.*;
import java.util.*;

public class L1T1 {
    static List<String> wordsList = new ArrayList<>();
    static Map<String, Integer> occurrences = new HashMap<>();

    public static void main(String[] args) {
        textReader();
        counter();
        printer();
    }

    public static void counter(){
        for ( String word : wordsList) {
            Integer oldCount = occurrences.get(word);
            if ( oldCount == null ) {
                oldCount = 0;
            }
            occurrences.put(word, oldCount + 1);
        }
    }
    public static void textReader(){
        String filePath = new File("src/main/resources/input.txt").getAbsolutePath();
        File inputFile = new File(filePath);
        BufferedReader reader = null;
        try {
            reader  = new BufferedReader(new FileReader(inputFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String text = "";
        try {
            text = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] words = text.split(" ");
        for(String word : words){
            String checkingWord = word.replaceAll("[^a-zA-Z\\s]","");
            wordsList.add(checkingWord);
        }
    }
    public static void printer(){
        for(Map.Entry<String, Integer> word : occurrences.entrySet()){
            System.out.println(word.getKey() + " - " + word.getValue());
        }
    }
}