package com.buseduc.javacourse.topic_01.task_05;

import com.buseduc.javacourse.utils.InputUtils;

import java.util.List;

/**
 * @author MariiaZakharova21
 * Тема 1. ОСНОВЫ ООП
 * Задание 1.5
 * Вывести суммы произведения n целых чисел.
 */
public class Task05 {
    public static void main(String[] args) {
        List<Integer> numbers = InputUtils.getNumbersFromInput();
        int sum = 0;
        int mult = 1;
        for (int number:
             numbers) {
            sum = sum + number;
            mult = mult * number;
        }
        System.out.println(sum);
        System.out.println(mult);
    }
}