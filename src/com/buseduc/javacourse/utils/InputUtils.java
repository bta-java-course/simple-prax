package com.buseduc.javacourse.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputUtils {
    public static List<Integer> getNumbersFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INFO. Для прекращения ввода введите нечисленное значение.");
        String hint = "Введите число: ";
        List<Integer> nums = new ArrayList<>();
        System.out.println(hint);
        while (scanner.hasNext()) {
            System.out.println(hint);
            String nextInput = scanner.next();
            try {
                nums.add(Integer.parseInt(nextInput));
            } catch (Exception e) {
                System.out.println("Конец ввода");
                break;
            }
        }
        scanner.close();
        return nums;
    }

    public static List<List<String>> get2dListFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<List<String>> ret = new ArrayList<>();
        String nextLine;
        while (reader.ready()) {
            nextLine = reader.readLine();
            String[] lineArray = nextLine.split(" ");
            List<String> lineList = Arrays.asList(lineArray);
            ret.add(lineList);
        }
        return ret;
    }
}
