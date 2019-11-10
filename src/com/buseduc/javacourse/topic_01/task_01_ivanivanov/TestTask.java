package com.buseduc.javacourse.topic_01.task_01_ivanivanov;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author ivanivanov
 * Тема 1. ОСНОВЫ ООП
 * Задание 98.
 * Вывести в консоль любой текст, введенный пользователем. Выйти из программмы, если длина введенной строки 0 или 1.
 */

public class TestTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hint = "Введите строку: ";
        System.out.println(hint);
        while (scanner.hasNext()) {
            String nextInput = scanner.next();
            if (nextInput.length() < 2) {
                System.out.println("Выход из программы.");
                break;
            }
            System.out.println(nextInput);
            System.out.println("Введите строку: ");
        }
        scanner.close();
    }
}
