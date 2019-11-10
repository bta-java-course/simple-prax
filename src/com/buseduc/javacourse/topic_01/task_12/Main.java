package com.buseduc.javacourse.topic_01.task_12;

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
        System.out.println(numbers.get(0));
    }
}
