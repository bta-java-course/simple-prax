package com.buseduc.javacourse.topic_02.task_02_8_mah0neh0ne;

import java.util.Scanner;

/**
 * @author mah0neh0ne
 * Тема 2. Типы и Операторы
 * Задание 2_8. Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе.
 */

public class TestTaskGo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            System.out.println("Предполагаемое количество чисел: ");
            int n = sc.nextInt();
            String palindromes = null;
            System.out.println("Введите числа: ");
            int[] a = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                String s1 = Integer.toString(a[i]);
                if (s1.length() > 1 && isPalindrome(s1)) {
                    palindromes += (s1 + " ");
                }
            }

            if (palindromes != null) {
                System.out.println("Числа палиндромы: " + palindromes);
            } else {
                System.out.println("Среди указанных чисел палиндром не обнаружен");
            }
        }

        private static boolean isPalindrome(String s) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    return false;
                }

            }
            return true;
        }
}


