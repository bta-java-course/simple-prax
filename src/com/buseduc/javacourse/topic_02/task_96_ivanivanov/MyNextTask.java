package com.buseduc.javacourse.topic_02.task_96_ivanivanov;

import com.buseduc.javacourse.utils.InputUtils;

import java.util.List;

/**
 * @author ivanivanov
 * Тема 2.
 * Задание 11.
 * Найти корни квадратного уравнения.
 * Параметры уравнения передавать
 * с командной строкой.
 */
public class MyNextTask {
    public static void main(String[] args) {
        List<Integer> coeffs = InputUtils.getNumbersFromInput();
        if (coeffs.size() < 3) {
            System.out.println("Как миниимум 3 коэффициента!");
            return;
        }
        int a = coeffs.get(0);
        int b = coeffs.get(1);
        int c = coeffs.get(2);
        System.out.println(a + "x2 + " + b + "x + " + c) ;
        int d = (int) Math.pow(b, 2) - 4 * a * c;

    }
}
