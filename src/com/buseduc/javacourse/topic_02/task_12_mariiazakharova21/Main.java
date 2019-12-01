package com.buseduc.javacourse.topic_02.task_12_mariiazakharova21;

import com.buseduc.javacourse.utils.InputUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * @author MariiaZakharova21
 * Тема 2. ТИПЫ И ОПЕРАТОРЫ
 * Задание 12
 * Вывести числа от 1 до k в таблицы чисел (4 Х 4) слева направо и сверху вниз.
 */

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        List<Integer> numbers = getIntegerListFromFile("data.txt");

        int[][] nums2 = new int[4][4];
        int k = 0;
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                nums2[i][j] = k < numbers.size() ? numbers.get(k) : 0;
                k++;
            }
        }

    }


    public static List<Integer> getIntegerListFromFile(String fileName) throws IOException, URISyntaxException {
        String path = Main.class.getResource("data.txt").getPath();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        List<Integer> ret = new ArrayList<>();
        String nextLine;
        while (reader.ready()) {
            nextLine = reader.readLine();
            String[] lineArray = nextLine.split(" ");
            for (String item : lineArray
            ) {
                Integer number = parseInt(item);
                ret.add(number);
            }

        }
        return ret;
    }
}
