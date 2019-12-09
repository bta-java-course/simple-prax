package com.buseduc.javacourse.topic_06.task_06_02_AlexSnigur;

/**
 * @author AlexSnigur
 * Тема 6. НАСЛЕДОВАНИЕ,ПОЛИМОРФИЗМ
 * Задание 06.02.
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {
    public static void main(String[] args) {

            //Задаём название модели, кол-во заправляемых литров, размер колёс. Вызываем методы:

            String model = "Lamborghini Aventador";

            Car car = new Car(model);
            System.out.println("Модель = " + car.getModel());

            car.move();
            car.fillUp(10);
            car.changeWheel(19);
            car.stop();
            car.fillUp(10);
            car.changeWheel(20);

            System.out.println(car.toString());
    }
}


