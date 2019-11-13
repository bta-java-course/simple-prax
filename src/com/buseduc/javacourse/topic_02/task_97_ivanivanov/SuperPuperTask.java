package com.buseduc.javacourse.topic_02.task_97_ivanivanov;

import com.buseduc.javacourse.utils.InputUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ivanivanov
 * Тема 2.
 * Задание 4.
 * Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
 */
public class SuperPuperTask {
    public static void main(String[] args) {
        int minNum = 0;
        int diffNums = Integer.MAX_VALUE;
        for(int num : InputUtils.getNumbersFromInput()) {
            String numAsStr = String.valueOf(num);
            Set<Character> uniqueChars = new HashSet<>();
        }
        System.out.println(minNum);
    }
}


