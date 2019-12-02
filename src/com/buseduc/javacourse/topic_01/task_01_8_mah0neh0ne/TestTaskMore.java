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
            System.out.println("INFO. Для прекращения ввода введите нечисленное значение или число между -35 и 35");
            String hint = "Введите целое число: ";
            System.out.println(hint);
            List<Long> nums = new ArrayList<>();
            while (scanner.hasNextLong()) {  //program will work, while input is integer or long integer
                long i = scanner.nextLong();
                if (i >-35 && i < 35) {
                    System.out.println("Эмм... этот диапазон чисел ТОЧНО не делится и на 5 и на 7. Забыл таблицу умножения?");
                    System.out.println("Task over");
                    break;
                } else if (i % 35 == 0)  //Least common multiple for simple numbers is numbers multiplying each other

                    nums.add(i);
            }
            System.out.println("числа делящиеся на 5 и 7 : " + nums);
            System.out.println("Task over");
        }
}



