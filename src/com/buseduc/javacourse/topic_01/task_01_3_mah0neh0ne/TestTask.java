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
        Scanner a = new Scanner(System.in);
        int result = 0;
        int y = a.nextInt();
        int c = a.nextInt();
        int diff = c - y + 1;
        Random r = new Random();
        System.out.println("Запрашиваемое количество");
        for (int x = 0; x < 20; x++) {
            result = r.nextInt(diff) + y;
            System.out.println(result);
        }
    }
}









