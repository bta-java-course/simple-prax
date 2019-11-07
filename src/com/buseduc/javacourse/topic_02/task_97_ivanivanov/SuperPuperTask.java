package com.buseduc.javacourse.topic_02.task_97_ivanivanov;

import com.buseduc.javacourse.utils.InputUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ivanivanov
 * Тема 2.
 * Задание 4.
 * Найти число, в котором число различных цифр минимально.
 * Если таких чисел несколько, найти первое из них.
 */
public class SuperPuperTask {
    public static void main(String[] args) {
        String file = "src/com/buseduc/javacourse/topic_02/task_97_ivanivanov/task_97.data";
        try {
            System.out.println(InputUtils.get2dListFromFile(file));
        } catch (IOException e) {
            System.out.println("ERRROr");
            e.printStackTrace();
        }


        int minNum = 0;
        int diffNums = Integer.MAX_VALUE;
        for(int num : InputUtils.getNumbersFromInput()) {
            String numAsStr = String.valueOf(num);
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : numAsStr.toCharArray()){
                uniqueChars.add(c);
            }
            int len = uniqueChars.size();
            if (len < diffNums) {
                diffNums = len;
                minNum = num;
            }

        }
        System.out.println(minNum);
    }
}


