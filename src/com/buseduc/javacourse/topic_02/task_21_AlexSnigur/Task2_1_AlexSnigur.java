package com.buseduc.javacourse.topic_02.task_21_AlexSnigur;

/**
 * @author AlexSnigur
 * Тема 2. ТИПЫ И ОПЕРАТОРЫ
 * Задание 2.1.
 * Найти самое короткое и самое длинное число. Вывести найденные числа и их длинну.
 */


import java.util.Scanner;

public class Task2_1_AlexSnigur {
    public static void main(String[] args) {
        System.out.println("Введите количество переменных,которые вы хотите добавить в массив и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int chisloNaVhode = scan.nextInt();
        int massive[] = new int[chisloNaVhode];
        int numbers[] = new int[chisloNaVhode];
        System.out.println();
        System.out.println("Введите числа через пробел и нажмите <Enter>:");
        for (int i = 0; i < chisloNaVhode; i++) {
            massive[i] = scan.nextInt();
            numbers[i] = (massive[i] + "").length();
        }
        scan.close();
        numbersLength(massive, numbers, chisloNaVhode);

    }// Здесь scanner принимает на вход введённые в консоль размер массива и числа



    private static void numbersLength(int[] massive, int[] numbers, int chisloNaVhode) {
        int max = numbers[0], min = numbers[0], big = 0, small = 0;
        for (int i = 1; i < chisloNaVhode; i++) {
            int j = numbers[i];
            if (min > j) {
                min = j;
                small = i;
            } else {
                if (max < j) {
                    max = j;
                    big = i;
                }
            }
        }
        System.out.println();
        System.out.println("Самое короткое число: " + massive[small] + "." + " Его длина: " + min + ";");
        System.out.println("Самое длинное число: " + massive[big] + "." + " Его длина: " + max + ";");
        System.out.println();

    }// Здесь с помощью операторов сортируем числа и выводим самое короткое и самое длинное из массива в консоль
}
