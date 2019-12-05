package com.buseduc.javacourse.topic_04.task_04_10_mah0neh0ne;

import java.util.Scanner;

/**
 * @author mah0neh0ne
 * Тема 4. СТРОКИ
 * Задание 4_10.
 * Найти, каких букв, гласных или согласных, больше в каждом предложении текста.
 */

public class WordTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String box = input.nextLine();
        int charCount = 0;
        String vowels = "aeiou";
        int counVow = 0;
        for (char charBox : box.toLowerCase().toCharArray()) {
            if (Character.isLetter(charBox)) {
                charCount++;
                if (vowels.indexOf(charBox) != -1)
                    counVow++;
            }
        }
        System.out.printf("Гласных = %d;%nСогласных = %d", counVow, charCount - counVow);
    }
}
