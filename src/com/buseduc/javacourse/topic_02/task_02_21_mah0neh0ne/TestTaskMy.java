package com.buseduc.javacourse.topic_02.task_02_21_mah0neh0ne;

import java.util.Arrays;
import java.util.Random;



/**
 * @author mah0neh0ne
 * Тема 2. Типы и Операторы
 * Задание 2_21. Создать таблицу чисел (4 Х 4) со случайными значениями от 0 до 3 и вывести ее на консоль.
Преобразовать строки таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
 */


public class TestTaskMy {
    public static void main(String[] args) {
        int[][] a = new int[4][4];
            Random rnd = new Random();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = rnd.nextInt(4);
                }
                System.out.println(Arrays.toString(a[i]));
            }
            System.out.println();

            for (int i = 0; i < a.length; i++) {
                int[][] res = new int[a.length][a[i].length];
                int index = 0;
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] != 0) res[i][index++] = a[i][j];
                }
                System.out.println(Arrays.toString(res[i]));
            }
        }
    }








