package com.buseduc.javacourse.topic_01.task_01_3_mah0neh0ne;

import java.util.Random;
import java.util.Scanner;

/**
 * @author mah0neh0ne
 * Тема 1. Основы ООП
 * Задание 1_3. Вывести заданное количество случайных чисел .
 */

public class TestTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        sc.nextInt();
        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"
        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number1);

        int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
        System.out.println("2-ое случайное число: " + random_number2);

        int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
        System.out.println("3-е случайное число: " + random_number3);



    }
    }









