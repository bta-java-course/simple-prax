package com.buseduc.javacourse.topic_01.task_01_15_mah0neh0ne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author mah0neh0ne
 * Тема 1. Основы ООП
 * Задание 1_15. Из n целых чисел вывести простые числа..
 */

public class TestTaskMore {
    public static void main(String[] args) {
        System.out.println("Введите положительное число: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        boolean b = true;
        for (int P = 2; P <= input; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(P);
            else b = true;
        }
    }
}



