package com.buseduc.javacourse.topic_01.task_12_mariiazakharova21;

import com.buseduc.javacourse.utils.InputUtils;

import java.util.List;

/**
 * @author MariiaZakharova21
 * Тема 1. ОСНОВЫ ООП
 * Задание 12
 * Из n целых чисел вывести все трехзначные числа, в записи которых нет одинаковых цифр.
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = InputUtils.getNumbersFromInput();

        for (int num :
                numbers) {

            int num1 = (num % 1000) % 10;
            int num2 = (num % 1000) / 100;
            int num3 = ((num % 1000) / 10) % 10;
            int num4 = num / 1000;
            if (num4 == 0 && num1 != num2 && num2 != num3 && num1 != num3) {
                System.out.println(num);
            }
        }
    }
}
