package com.buseduc.javacourse.utils;

import java.util.ArrayList;
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
}
