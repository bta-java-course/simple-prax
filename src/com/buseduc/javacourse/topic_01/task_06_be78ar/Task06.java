package com.buseduc.javacourse.topic_01.task_06_be78ar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author be78ar
 * Тема 1. ОСНОВЫ ООП
 * Задание 1.6.
 * Вывести четные и нечетные числа из n целых чисел.
 */

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hint = "Введите целое число: ";
        System.out.println(hint);
        List odd = new ArrayList<>();
        List even = new ArrayList<>();
        while (scanner.hasNextInt()) {  //program will work, while input is integer
            int i = scanner.nextInt();
            if(i==0){       //check for zero
                System.out.println("Ноль не относится к целым числам");
                break;
            }else if ( i % 2 == 0)
                even.add(i);
            else
                odd.add(i);

            System.out.println("Введите целое число: ");
        }
            System.out.println("Это не целое число. Перезапустите программу");
            System.out.println("Нечётные числа :" + odd);
            System.out.println("Чётные числа :" + even);
            scanner.close();
    }
}
