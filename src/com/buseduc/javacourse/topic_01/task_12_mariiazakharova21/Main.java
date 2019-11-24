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
            int numOnes = (num % 1000) % 10;
            int numHundreds = (num % 1000) / 100;
            int numDozens = ((num % 1000) / 10) % 10;
            int numThousands = num / 1000;
            if (numThousands == 0 && numHundreds != 0 &&
                    numOnes != numDozens && numDozens != numHundreds &&
                    numOnes != numHundreds) {
                System.out.println(num);
            }
        }
    }
}
