package com.buseduc.javacourse.topic_09.task_9_5_AlexSnigur;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author AlexSnigur
 * Тема 9. АЛГОРИТМЫ И КОЛЛЕКЦИИ
 * Задание 9_5.
 * Задать 2 стека, поменять информацию местами
 */

public class StackTask {
    public static void main(String[] args) {

        // Создаём 2 стека,добавляем в них зачения,выводим эти значения в консоль:
        Stack<Integer> firstStack = new Stack<>();
        Stack<Integer> secondStack = new Stack<>();


        firstStack.push(12);
        firstStack.push(34);

        secondStack.push(56);
        secondStack.push(78);


        System.out.println("Первый стек до замены: " + firstStack);
        System.out.println("Второй стек до замены: " + secondStack);

        //Создаём итератор для прохода по элементам в массивах:
        Iterator<Integer> i = firstStack.iterator();
        Iterator<Integer> i2 = secondStack.iterator();

        //Создаём 2 массива,куда помещаем наши значения:
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // С помощью итератора проходим по нашим значениям:
        while(i.hasNext()) {
            list.add(i.next());
        }

        while(i2.hasNext()) {
            list2.add(i2.next());
        }

        firstStack.clear();

        for(int j = 0;j < list2.size(); j++) {
            firstStack.push(list2.get(j));
        }

        secondStack.clear();

        for(int j = 0 ; j < list.size(); j++) {
            secondStack.push(list.get(j));
        }

        // С помощью цикла for замещаем наши значения в массивах и выводим новые значения в консоль:
        System.out.println("Первый стек после замены: " + firstStack);
        System.out.println("Второй стек после замены: " + secondStack);


    }

}




