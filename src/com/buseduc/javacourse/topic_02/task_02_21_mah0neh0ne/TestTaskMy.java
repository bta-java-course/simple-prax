package com.buseduc.javacourse.topic_02.task_02_21_mah0neh0ne;

/**
 * @author mah0neh0ne
 * Тема 2. Типы и Операторы
 * Задание 2_21. Создать таблицу чисел (4 Х 4) со случайными значениями от 0 до 3 и вывести ее на консоль.
Преобразовать строки таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
 */


public class TestTaskMy {
    public static void main(String[] args) {
        int[][] matrixA;
        matrixA = new int[4][4];

        matrixA[0][0] = 1;
        matrixA[0][1] = 2;
        matrixA[0][2] = 3;
        matrixA[1][0] = 3;
        matrixA[1][1] = 1;
        matrixA[1][2] = 3;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}