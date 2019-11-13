package com.buseduc.javacourse.topic_01.task11_AlexSnigur;

import java.util.Scanner;
/**
 * @author AlexSnigur
 * Тема 1. ООП
 * Задание 1.1.
 * Приветствовать любого пользователя при вводе его имени с командной строки.
 */

public class SayHelloToUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, and press <Enter>");
        String name = scanner.next();
        System.out.println("Welcome, " + name);
    }
}
