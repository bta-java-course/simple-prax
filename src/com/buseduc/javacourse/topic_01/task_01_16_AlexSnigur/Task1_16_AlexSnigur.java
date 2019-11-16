package com.buseduc.javacourse.topic_01.task_01_16_AlexSnigur;
/**
 * @author AlexSnigur
 * Тема 1. ООП
 * Задание 1.16
 * Из n целых чисел вывести числа в порядке убывания частоты встречаемости чисел.
 */


import java.util.Scanner;

public class Task1_16_AlexSnigur {
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
            numbersLength(massive);

        }// Здесь scanner принимает на вход введённые в консоль размер массива и числа (взял из своего задания 2.1).

    private static void numbersLength(int[] massive) {
    for (int i = massive.length - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            if (massive[j] < massive[j+1]) {
                int num = massive[j];
                massive[j] = massive[j+1];
                massive[j+1] = num;
            }
        }
    }
        System.out.println();
        System.out.println("Вывожу числа в порядке убывания: ");

        for (Integer m : massive){
            System.out.print(m + " ");
    }
        System.out.println();
}// Здесь  с помощью цикла for пробегаемся по массиву и выстраиваем числа в ряд в порядке убывания.
}






