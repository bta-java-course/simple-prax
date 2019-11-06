package com.buseduc.javacourse.topic_01.task_1_15_mah0neh0ne;

/**
 * @author mah0neh0ne
 * Тема 1. Основы ООП
 * Задание 1_15. Из n целых чисел вывести простые числа.
 */

public class TestTaskMore {
    public static void main(String[] args) {
        boolean b = true;
        for(int i=1; i<21; i++)
        {
            if (i==1)
            {
                System.out.println("Число 1 - простоe число.");
            }
            if(i==2)
            {
                System.out.println("Число 2 - простое число.");
            }
            else
            {
                for(int j=2; j<i; j++)
                {
                    if (i%j==0)
                        b = false;
                    }
                }
                if (b=false)
                    System.out.println("Число "+i+" - непростое число.");
                else
                    System.out.println("Число "+i+" - простое число.");
            }

        }
    }


