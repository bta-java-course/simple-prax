package com.buseduc.javacourse.topic_04.task_04_29_mah0neh0ne;


import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author mah0neh0ne
 * Тема 4. СТРОКИ
 * Задание 4_29.
 * Найти наибольшее количество предложений текста, в которых есть одинаковые слова.
 */
public class PffTask {
    public static void main(String[] args) {
        String text = "Быстрое развитие услуг добровольного медицинского "
                + "страхования услуг дало толчок для улучшения и совершенствования "
                + "предоставляемых медицинских услуг. Начиная с 2008 года "
                + "группа проект по созданию сети медицинских центров по всей "
                + "территории России, под названием «Альфа-Центр Здоровья».";
        String[] sentences = text.split("[.!?]\\s");
        int count = 0;
        for (int i = 0; i < sentences.length; i++) {
            String temp = sentences[i];
            sentences[i] = sentences[i].toLowerCase().replaceAll("[^а-яa-z'\\s\\-]", "");
            String[] words = sentences[i].split("\\s+");
            Set<String> set = new HashSet<>(Arrays.asList(words));
            if (set.size() < words.length) {
                System.out.println(temp);
                System.out.println("Одинаковых слов: " + (words.length - set.size() + 1));
                count++;
            }
        }
        System.out.println("Предложений, имеющих повторяющиеся слова: " + count);
    }
}
    
    

