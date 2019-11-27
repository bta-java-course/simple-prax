package com.buseduc.javacourse.topic_01.task_01_8_mah0neh0ne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author mah0neh0ne
 * Тема 1. Основы ООП
 * Задание 1_8. Вывести числа, которые делятся на 3 или на 9  из n целых чисел .
 */

public class TestTaskMore {
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



