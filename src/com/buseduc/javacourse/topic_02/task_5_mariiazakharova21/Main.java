package com.buseduc.javacourse.topic_02.task_5_mariiazakharova21;

import com.buseduc.javacourse.utils.InputUtils;
import javafx.util.Pair;

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
        int a = 0;
        int b = 0;
        for (int n : numbers
        ) {
            List<Integer> digits = getDigits(n);
            Numbers x = compute(digits);

            if (x.odd == 0) {
                a++;
            }

            if (x.even == x.odd) {
                b++;
            }

        }
        System.out.println(a);
        System.out.println(b);
    }

    public static List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<Integer>();
        while (number != 0) {
            int x = number % 10;
            digits.add(x);
            number = number / 10;
        }
        return digits;
    }

    public static Numbers compute(List<Integer> digits) {
        int countOdd = 0;
        int countEven = 0;
        for (int d : digits
        ) {
            if (d % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return new Numbers(countEven, countOdd);
    }
}
