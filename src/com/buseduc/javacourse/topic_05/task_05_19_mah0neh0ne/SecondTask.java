package com.buseduc.javacourse.topic_05.task_05_19_mah0neh0ne;

import java.util.Scanner;

/**
 * @author mah0neh0ne
 * Тема 5. ВВОД/ВЫВОД
 * Задание 5_19. Прочитать строки из файла и поменять местами первое и последнее слова в каждой строке.
 *
 */


public class SecondTask {
    public static void main(String[] args) {
        String str = "очень хочу сделать задание";
        String[] arrStr = str.split(" ");
        String poket = arrStr[0];
        arrStr[0] = arrStr[arrStr.length - 1];
        arrStr[arrStr.length - 1] = poket;
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < arrStr.length; i++) {
            strBuilder.append(arrStr[i].concat(" "));
        }
        System.out.println(strBuilder);
    }
    }
