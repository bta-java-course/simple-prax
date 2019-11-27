package com.buseduc.javacourse.topic_02.task_02_8_mah0neh0ne;


/**
 * @author mah0neh0ne
 * Тема 2. Типы и Операторы
 * Задание 2_8. Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestTaskLolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для прекращения ввода введите нечисленное значение или число между -45 и 45");
        String hint = "Введите целое число: ";
        System.out.println(hint);
        List<Long> nums = new ArrayList<>();
        while (scanner.hasNextLong()) {  //program will work, while input is integer or long integer
            long i = scanner.nextLong();
            if (i >-45 && i < 45) {
                System.out.println("Эмм... этот диапазон чисел ТОЧНО не делится и на 3 и на 9. Забыл таблицу умножения?");
                System.out.println("Task over");
                break;
            } else if (i % 45 == 0)
                nums.add(i);
        }
        System.out.println("числа делящиеся на 3 и 9 : " + nums);
        System.out.println("Task over");
    }
}

