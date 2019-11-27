package com.buseduc.javacourse.topic_02.Task_09_be78ar;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author be78ar
 * Тема 2. ТИПЫ И ОПЕРАТОРЫ
 * Задание 2.09.
 * Вывести на консоль название месяца, соответствующего введенному числу.
 * Осуществить проверку корректности ввода чисел.
 */


public class Task_09 {

    public static void main(String[] args) throws IOException {
        BufferedReader numReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер месяца от 1 до 12:");
        String snum = numReader.readLine();
        try{
            int num = Integer.parseInt(snum);
        }catch (Exception e){
                System.out.println("Вы ввели какую то ерунду!");
                return;
        }
        int num = Integer.parseInt(snum);
        if (num >= 1 && num <= 12){
            num = num - 1;
            for (Months months:Months.valueOf()) {
                if (months.ordinal() == num) {
                    String name = months.getTitle(num);
                    System.out.println("Месяц соответствующий этому числу: " + name);
                }
            }
        }else
        System.out.println("На нашей планете такого месяца нет, попробуйте другую звезную систему. Конец ввода");
    }


}
