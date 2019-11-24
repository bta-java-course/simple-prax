package com.buseduc.javacourse.topic_02.task_5_mariiazakharova21;

import com.buseduc.javacourse.utils.InputUtils;

/**
 * @author MariiaZakharova21
 * Тема 2. ТИПЫ И ОПЕРАТОРЫ
 * Задание 5
 * Найти количество чисел, содержащих только четные цифры, и количество чисел с равным числом четных и нечетных цифр.
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = InputUtils.getNumbersFromInput();

        for (int n : numbers
             ) {
            System.out.println(n);
        }
    }

    public static List<Integer> getDigits(int number){
        List<Integer> digits = new ArrayList<Integer>();
        while (number != 0){
            int x = number % 10;
            digits.add(x);
            number = number / 10;
        }
        return digits;
    }
}
