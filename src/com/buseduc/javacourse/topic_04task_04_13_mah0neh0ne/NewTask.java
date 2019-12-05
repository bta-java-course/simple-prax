package com.buseduc.javacourse.topic_04task_04_13_mah0neh0ne;

/**
 * @author mah0neh0ne
 * Тема 4. СТРОКИ
 * Задание 4_13.
 * В тексте найти буквы, которые встречаются во всех словах.
 */



public class NewTask {
    public static void main(String[] args) {
        String input = "Очень интересное здание";
        String[] words = input.split(" ");
        boolean isContain;
        System.out.print("Встречающиеся во всех словах буквы: ");
        for (int i = 0; i < words[0].length(); i++) {
            isContain = true;
            for (int j = 1; j < words.length; j++) {
                isContain &= words[j].contains(String.valueOf(words[0].charAt(i)));
            }
            if(isContain) System.out.print(words[0].charAt(i) + " ");
        }
    }
}
