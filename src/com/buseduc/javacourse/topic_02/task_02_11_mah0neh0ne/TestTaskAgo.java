package com.buseduc.javacourse.topic_02.task_02_11_mah0neh0ne;

/**
 * @author mah0neh0ne
 * Тема 2. Типы и Операторы
 * Задание 2_11. Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой.
 */

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTaskAgo {
    static float a, b, c;
    static float d;
    static double x1, x2;

    public static void main(String args []) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Решение квадратного уравнения");
        while (true) {
            try {
                System.out.println("Введите 'c' чтобы продолжать или любой другой символ для выхода");
                String str = s.next();
                if (!str.equals("c")) {
                    s.close();
                    System.exit(0);
                }
                System.out.print("Введите значение a -> ");
                a = s.nextFloat();
                System.out.print("Введите значение b -> ");
                b = s.nextFloat();
                System.out.print("Введите значение c -> ");
                c = s.nextFloat();
                System.out.println("a = " + a + " b = " + b + " c = " + c);

                d = (b * b) - (4 * a * c);

                System.out.println("Дискриминант = " + d);

                if(d < 0)
                    System.out.print("Уравнение не имеет решений!!!");
                else
                if(d == 0) {
                    x1 = (-b) / (2 * a);
                    System.out.println ("x = " + x1);
                }
                else {
                    x1 = (-b + Math.sqrt(d)) / (2 * a);
                    x2 = (-b - Math.sqrt(d)) / (2 * a);
                    if (x1 == x2) {
                        System.out.println ("x1 = x2 " + x1);
                    } else {
                        System.out.println ("x1 =  " + x1 + "  x2 = " + x2);
                    }
                }
            } catch(InputMismatchException e){
                System.out.println("!!!Ошибка ввода!!!");
            }
        }
    }
}






