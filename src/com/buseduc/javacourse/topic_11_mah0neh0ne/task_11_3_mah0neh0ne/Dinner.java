package com.buseduc.javacourse.topic_11_mah0neh0ne.task_11_3_mah0neh0ne;

/**
 * @author mah0neh0ne
 * Тема 11. ШАБЛОНЫ
 * Задание 11_3. Builder. Разработать модель системы Комплексный обед.
 * Написать код приложения, позволяющий создавать как стандартные комплексные обеды, так и обеды, в которые включены дополнительные блюда из меню.
 *
 */


import java.util.ArrayList;

public class Dinner {
    private final ArrayList<String> dinner = new ArrayList<>();

    public void Add(String food){
        dinner.add(food);
    }

    public void show(){
        for (String di: dinner){
            System.out.println(di);
        }
    }
}

