package com.buseduc.javacourse.topic_04.task_26_mariiazakharova21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MariiaZakharova21
 * Тема 4. СТРОКИ
 * Задание 26
 * Вывести в заданном тексте все слова, расположив их в алфавитном порядке.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        String content = readFile("Text.txt");
        content = content.replaceAll("[^A-Za-z0-9 ]", "");
        System.out.println(content);
        List<Word> words = processTest(content);
        sortWords(words);
        printWords(words);
    }

    private static String readFile(String fileName) throws IOException {
        String path = Main.class.getResource(fileName).getPath();
        path = System.getProperty("os.name").contains("indow") ? path.substring(1) : path;
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    private static List<Word> processTest(String text) {
        List<Word> words = new ArrayList<>();
        for (String item : text.split(" ")
        ) {
            Word word = new Word(item);
            words.add(word);
        }
        return words;
    }

    private static void sortWords(List<Word> words) {
        Word temp;
        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).compare(words.get(j)) > 0) {
                    temp = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, temp);
                }
            }
        }
    }

    private static void printWords(List<Word> words) {
        for (Word word : words
        ) {
            System.out.println(word.getString());
        }
    }
}
