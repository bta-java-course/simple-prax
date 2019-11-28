package com.buseduc.javacourse.topic_02.task_02_21_mah0neh0ne;

import java.util.Scanner;

public class TestTaskMok {
    public static void main(String[] args) {
        System.out.print("Введите n-размерность квадратной матрицы: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] sourceNumbers = new int[n][n];

        for (int i = 0; i < sourceNumbers.length; i++) {
            for (int j = 0; j < sourceNumbers[i].length; j++) {
                sourceNumbers[i][j] = (int) (Math.random()*((n+1)-(-n))) + (-n);
            }
        }

        for (int i = 0; i < sourceNumbers.length; i++) {
            System.out.println();
            for (int j = 0; j < sourceNumbers[i].length; j++) {
                System.out.print(sourceNumbers[i][j] + "\t");
            }
        }
        System.out.println("\n");


        // Преобразовать строки матрицы таким образом, чтобы элементы, равные
        // нулю, располагались после всех остальных.

        int countZero = 0;
        int size = n;
        for (int i1 = 0; i1 < size; i1++){
            for (int j1 = i1; j1 < size; j1++){
                if(sourceNumbers[i1][j1] == 0) {
                    countZero++;
                    for (int i2 = i1; i2 < size; i2++){
                        for (int j2 = j1; j2 < size; j2++){
                            if(j2 + 1 == size && i2 < size){
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
                    sourceNumbers[size-1][size-1-countZero] = 0; // вставка нулей в последнюю строку
                }
            }
        }

        System.out.println("Вывод матрицы после преобразований:");
        for (int i = 0; i < sourceNumbers.length; i++) {
            System.out.println();
            for (int j = 0; j < sourceNumbers[i].length; j++) {
                System.out.print(sourceNumbers[i][j] + "\t");
            }
        }
    }
}



