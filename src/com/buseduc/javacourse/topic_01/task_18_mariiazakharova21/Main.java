package com.buseduc.javacourse.topic_01.task_18_mariiazakharova21;

import com.buseduc.javacourse.utils.InputUtils;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = InputUtils.getNumbersFromInput();

        for (int number :
                numbers) {
            if (isFib(number)) {
                System.out.println(number);
            }
        }
    }

    public static void printFibonacci(int num) {
        int x0 = 0;
        int x1 = 1;
        int x2 = 1;

        System.out.println(x0);
        for (int i = 0; i < num; i++) {
            x0 = x1;
            x1 = x2;
            x2 = x1 + x0;
            System.out.println(x0);
            // System.out.println(i + " : x0=" + x0 + ", x1="+x1+", x2="+x2);
        }
    }

    public static boolean isFib(int num) {
        int a = 5 * num * num + 4;
        int b = 5 * num * num - 4;
        boolean a1 = isPerfectSquare(a);
        boolean b1 = isPerfectSquare(b);
        return a1 || b1;
    }

    public static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        int n = (int) sqrt;
        return n * n == num;
    }
}
