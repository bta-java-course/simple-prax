package com.buseduc.javacourse.topic_04.task_04_be78ar;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author be78ar
 * Тема 4. СТРОКИ
 * Задание 4.4
 * После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово.
 */

public class StringAddWord {
    public static void main(String[] args) {
        getTextFromInput();
        String inputText = textVars[0]; // text line to change for
        String expr = textVars[1]; // expression for change
        String word = textVars[2]; //word to add to expression


        Pattern pattern = Pattern.compile(expr + "\\b");
        Matcher matcher = pattern.matcher(inputText);

            System.out.println(matcher.replaceAll(expr + " " + word));


    }
    static String[] textVars = new String[3];
    static String[] getTextFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String inputText = scanner.nextLine();
        textVars[0] = inputText;
        System.out.println("Введите выражение подстроки, куда будем вставлять слова: ");
        String inputUnderString = scanner.nextLine();
        textVars[1] = inputUnderString;
        System.out.println("Введите слово для добавления: ");
        String inputWord = scanner.nextLine();
        textVars[2] = inputWord;
        scanner.close();
        return textVars;
    }
}
