package com.buseduc.javacourse.topic_02.task_02_11_mah0neh0ne;

/**
 * @author mah0neh0ne
 * Тема 2. Типы и Операторы
 * Задание 2_11. Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой.
 */


import java.util.Scanner;


public class TestTaskDo {
    private static final double D = 0;

    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);

        int a = con.nextInt();

        int b = con.nextInt();

        int c = con.nextInt();



        int d = b * b - 4 * a * c;

        double x1 = (-b - Math.sqrt(1.0 * d)) / (2 * a);

        double x2 = (-b + Math.sqrt(1.0 * d)) / (2 * a);



        if (d == 0)

            System.out.printf("One root: %.0f\n", x1);

        else if (d < 0)

            System.out.printf("No roots\n");

        else if (x1 < x2)

            System.out.printf("Two roots: %.0f %.0f\n", x1, x2);

        else

            System.out.printf("Two roots: %.0f %.0f\n ", x2, x1);

    }

}