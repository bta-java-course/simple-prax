package com.buseduc.javacourse.topic_04.task_9_mariiazakharova21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author MariiaZakharova21
 * Тема 4. СТРОКИ
 * Задание 9
 * В тексте найти и напечатать n символов (и их количество), встречающихся наиболее часто.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        int displayCount = 10;
        String content = readFile("Text.txt");
        System.out.println(content);
        Map<Character, Integer> symbols = processText(content);
        // sort, reverse, take
        symbols = symbols.entrySet()
                .stream()
                .sorted(Collections.reverseOrder( Map.Entry.comparingByValue()))
                .limit(displayCount)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
        printSymbols(symbols);
    }

    private static String readFile(String fileName) throws IOException {
        String path = Main.class.getResource(fileName).getPath();
        path = System.getProperty("os.name").contains("indow") ? path.substring(1) : path;
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    private static HashMap<Character, Integer> processText(String text) {
        HashMap<Character, Integer> symbols = new HashMap<>();
        for (Character symbol : text.toCharArray()
        ) {
            if (symbols.containsKey(symbol)) {
                int value = symbols.get(symbol);
                value++;
                symbols.replace(symbol, value);
            } else {
                symbols.put(symbol, 1);
            }
        }
        return symbols;
    }

    private static void printSymbols(Map<Character, Integer> symbols) {
        for (Map.Entry<Character, Integer> symbol : symbols.entrySet()
        ) {
            System.out.println(symbol.getKey() + " (" + (int) symbol.getKey() + ") = " + symbol.getValue());
        }
    }

}
