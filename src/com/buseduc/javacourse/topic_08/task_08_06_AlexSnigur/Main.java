package com.buseduc.javacourse.topic_08.task_08_06_AlexSnigur;

/**
 * @author AlexSnigur
 * Тема 8.ИНТЕРФЕЙСЫ,АБСТР.КЛАССЫ
 * Задание 8_6. abstract class Корабль ➙  Военный Корабль (interface Авианосец).
 */

public class Main {
    public static void main(String [] args) {

        BattleShip mainShip = new BattleShip(20);
        mainShip.toFloat();
        System.out.println(((AircraftCarrier) mainShip).hasAircraftsOnBoard());
    }
}