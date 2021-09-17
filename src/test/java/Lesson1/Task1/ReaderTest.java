package Lesson1.Task1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Map;

public class ReaderTest {

    @Test
    public void countWords() {
        Reader.wordsList.add("Hello");
        Reader.wordsList.add("Hello");
        Reader.wordsList.add("My");
        Reader.wordsList.add("World");
        Reader.wordsList.add("World");
        Reader.countWords();

        int countWordsResult1 = Reader.occurrenceRepeat.get("Hello");
        int actualResult1 = 2;
        int countWordsResult2 = Reader.occurrenceRepeat.get("My");
        int actualResult2 = 1;
        int countWordsResult3 = Reader.occurrenceRepeat.get("World");
        int actualResult3 = 2;

        Assertions.assertTrue(countWordsResult1 == actualResult1);
        Assertions.assertTrue(countWordsResult2 == actualResult2);
        Assertions.assertTrue(countWordsResult3 == actualResult3);
    }

    @Test
    public void textReader() {

    }

    @Test
    public void printer() {
        Reader.occurrenceRepeat.put("Hello", 2);
        Reader.occurrenceRepeat.put("World", 3);
        Reader.printer();

        String[] actualResult = {"Hello - 2", "World - 3"};
        int count = 0;
        for (Map.Entry<String, Integer> entry : Reader.occurrenceRepeat.entrySet()) {
            String printerResult = entry.getKey() + " - " + entry.getValue();
            Assertions.assertTrue(printerResult.equals(actualResult[count]));
            count++;
        }
    }

    @Test
    public void splitter() {
        String line = "Hello, World!";
        Reader.splitter(line);

        String readerResult1 = Reader.wordsList.get(0);
        String actualResult1 = "Hello";
        String readerResult2 = Reader.wordsList.get(1);
        String actualResult2 = "World";

        Assertions.assertTrue(readerResult1.equals(actualResult1) & readerResult2.equals(actualResult2));
    }
}