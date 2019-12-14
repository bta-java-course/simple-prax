package com.buseduc.javacourse.topic_05.task_13_mariiazakharova21;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author MariiaZakharova21
 * Тема 5. ВВОД/ВЫВОД
 * Задание 13
 * Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Random r = new Random();

        String fileName = "data.txt";

        File file = new File(fileName);

        if (file.createNewFile()) {
            System.out.println();
        } else {
            System.out.println();
        }

        FileWriter writer = new FileWriter(file);
        for (int i = 0; i < r.nextInt(100) + 100; i++) {
            writer.write(Integer.toString(r.nextInt(1000)) + " ");
        }
        writer.close();

        String content = new String(Files.readAllBytes(Paths.get(file.getPath())));
        System.out.println("File content:");
        System.out.println(content);

        System.out.println("Sorting file...");
        String[] parts = content.split(" ");
        List<Integer> numbers = new ArrayList<Integer>();
        for (String part : parts
        ) {
            Integer number = Integer.parseInt(part);
            numbers.add(number);
        }
        numbers.sort(Integer::compareTo);

        writer = new FileWriter(file);
        for (int i = 0; i < numbers.size(); i++) {
            writer.write(Integer.toString(numbers.get(i)) + " ");
        }
        writer.close();

        content = new String(Files.readAllBytes(Paths.get(file.getPath())));
        System.out.println("Sorted file:");
        System.out.println(content);
    }
}
