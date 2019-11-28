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
        int max, min;
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(4) + 0;
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        int countZero = 0;
        int n = 0;
        double[][] sourceNumbers = new double[0][];
        for (int i1 = 0; i1 < n; i1++){
            for (int j1 = i1; j1 < n; j1++){
                if(sourceNumbers[i1][j1] == 0) {
                    countZero++;
                    for (int i2 = i1; i2 < n; i2++){
                        for (int j2 = j1; j2 < n; j2++){
                            if(j2 + 1 == n && i2 < n){
                                // смещение первого элемента след. строки
                                int p1 = i2 + 1;
                                int p2 = 0;
                                sourceNumbers[i2][j2] = sourceNumbers[p1][p2];
                            }
                            else
                                sourceNumbers[i2][j2] = sourceNumbers[i2][j2+1];
                        }
                        j1 = 0;// если 0 был не в начале строки, со следующей строки j обнуляем
                    }
                    sourceNumbers[n -1][n -1-countZero] = 0; // вставка нулей в последнюю строку
                }
            }
        }
        for (int i = 0; i < sourceNumbers.length; i++) {
            System.out.println();
            for (int j = 0; j < sourceNumbers[i].length; j++) {
                System.out.print(sourceNumbers[i][j] + "\t");
            }
        }
    }
    }







