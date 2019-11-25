package com.buseduc.javacourse.topic_08.task_99_ivanivanov;

/**
 * @author ivanivanov
 * Тема 8.
 * Задание 99. abstract class Самолет ➙  Пассажирский самолет (interface Чартер).
 */

public class MyInterfaceTask {
    public static void main(String[] args) {

        Plane myplane = new PassengerPlane(2000);
        myplane.toLand();
        Charter charter = (PassengerPlane) myplane;
        System.out.println(charter.hasContractWithTourOp());

    }

}