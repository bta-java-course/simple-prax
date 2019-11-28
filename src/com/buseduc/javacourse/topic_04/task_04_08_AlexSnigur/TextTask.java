package com.buseduc.javacourse.topic_04.task_04_08_AlexSnigur;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AlexSnigur
 * Тема 4. СТРОКИ
 * Задание 4_8.
 * Определить, сколько раз в тексте повторяется каждое слово, которое встречается в нём.
 */

public class TextTask {
    public static void main(String[] args) {
            String message = "Чтобы понять, что такое рекурсия, нужно понять, что такое рекурсия. На самом деле, в понимании таких функций нет ничего сложного, нужно только один раз хорошо в этом разобраться.  ";
            String [] words = message.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s"); //здесь убираем заглавные буквы и знаки препинания.

            Map<String, Integer> counterMap = new HashMap<>(); // Здесь помещаем текст в хэш мап и с помощью счётчика считаем наши слова
            for (String word : words) {
                if(!word.isEmpty()) {
                    Integer count = counterMap.get(word);
                    if(count == null) {
                        count = 0;
                    }
                    counterMap.put(word, ++count);
                }
            }

            for(String word : counterMap.keySet()) {
                System.out.println(word + ": " + counterMap.get(word)); // Полученный результат выводим в консоль
            }
        }
    }


