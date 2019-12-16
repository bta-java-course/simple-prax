package com.buseduc.javacourse.topic_08.task_08_be78ar;

/**
 * @author be78ar
 * Тема 8.ИНТЕРФЕЙСЫ,АБСТР.КЛАССЫ
 * Задание 8_8. Корабль ➙  class Грузовой Корабль ➙  class Танкер (interface Корабль в рейсе)
 */

public class Main {
    public static void main(String[] args) {
        Tanker tanker = new Tanker(true,25000);
        tanker.toFloat();
        if((tanker).isShipWithCargo() == true) {
            System.out.println("Tanker delivering danger cargo");
        }
    }
}
