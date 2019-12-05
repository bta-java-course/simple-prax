package com.buseduc.javacourse.topic_10.task_93_ivanivanov;

public class Dispatcher {
    Car car;
    private static Dispatcher instance;
    private Dispatcher() {
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }


    public static Dispatcher getInstance() {
        if (instance == null) {
            instance = new Dispatcher();
        }
        return instance;
    }
}
