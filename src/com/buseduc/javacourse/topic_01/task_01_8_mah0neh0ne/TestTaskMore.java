package com.buseduc.javacourse.topic_01.task_01_8_mah0neh0ne;

/**
 * @author mah0neh0ne
 * Тема 1. Основы ООП
 * Задание 1_8. Вывести числа, которые делятся на 3 или на 9  из n целых чисел .
 */

public class TestTaskMore {

    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {    // Задал числа которые делятся от 1 до 100
            if (i % 3 == 0)
                if (i % 9 == 0)
                    System.out.print(i + " ");
        }
    }
}


