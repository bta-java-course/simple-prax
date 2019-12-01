package com.buseduc.javacourse.topic_02.task_19_mariiazakharova21;

import java.util.Random;

/**
 * @author MariiaZakharova21
 * Тема 2. ТИПЫ И ОПЕРАТОРЫ
 * Задание 19
 * Создать таблицу чисел (4 Х 4) со случайными значениями от 0 до 3 и вывести ее на консоль.
 * Если в таблице есть строки / столбцы, содержащие одинаковые числа (напр., 0 0 0 0),
 * то удалить эти строки / столбцы.
 */

public class Main {
    public static void main(String[] args) {
        Integer[][] twoDArray = createArray();
        printArray(twoDArray);

        int rowIndex = -1;
        while ((rowIndex = findRowIndex(twoDArray)) != -1) {
            twoDArray = deleteRow(twoDArray, rowIndex);
        }

        int columnIndex = -1;
        while ((columnIndex = findColumnIndex(twoDArray)) != -1) {
            twoDArray = deleteColumn(twoDArray, columnIndex);
        }

        printArray(twoDArray);
    }

    public static void printArray(Integer[][] twoDArray) {
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }

    public static Integer[][] createArray() {
        Integer[][] twoDArray = new Integer[4][4];
        Random random = new Random();

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = random.nextInt(4);
            }
        }
        return twoDArray;
    }

    public static int findRowIndex(Integer[][] twoDArray) {
        for (int i = 0; i < twoDArray.length; i++) {
            int k = 0;
            for (int j = 1; j < twoDArray[i].length; j++) {
                if (twoDArray[i][0] == twoDArray[i][j]) {
                    k++;
                }
            }
            if (k == 3) {
                return i;
            }
        }
        return -1;
    }

    public static int findColumnIndex(Integer[][] twoDArray) {
        for (int i = 0; i < twoDArray[0].length; i++) {
            int k = 0;
            for (int j = 1; j < twoDArray.length; j++) {
                if (twoDArray[0][i] == twoDArray[j][i]) {
                    k++;
                }
            }
            if (k == 3) {
                return i;
            }
        }
        return -1;
    }

    public static Integer[][] deleteRow(Integer[][] twoDArray, int rowIndex) {
        Integer[][] newArray = new Integer[twoDArray.length-1][twoDArray[0].length];
        int k = 0;
        for (int i = 0; i < twoDArray.length; i++) {

            if (i == rowIndex) {
                continue;
            }

            for (int j = 0; j < twoDArray[i].length; j++) {
                newArray[k][j] = twoDArray[i][j];
            }
            k++;
        }
        return newArray;
    }

    public static Integer[][] deleteColumn(Integer[][] twoDArray, int columnIndex) {
        Integer[][] newArray = new Integer[twoDArray.length][twoDArray[0].length-1];
        int k = 0;
        for (int i = 0; i < twoDArray[0].length; i++) {

            if (i == columnIndex) {
                continue;
            }

            for (int j = 0; j < twoDArray.length; j++) {
                newArray[j][k] = twoDArray[j][i];
            }
            k++;
        }
        return newArray;
    }


}
