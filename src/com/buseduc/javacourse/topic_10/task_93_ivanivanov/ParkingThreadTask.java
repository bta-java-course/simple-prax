package com.buseduc.javacourse.topic_10.task_93_ivanivanov;

import java.awt.geom.Dimension2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingThreadTask {
    public static void main(String[] args) {

        ParkingLot p1 = new ParkingLot(false , "p1", 10000);
        ParkingLot p2 = new ParkingLot(false , "p2", 6500);
        ParkingLot p3 = new ParkingLot(false , "p3", 5000);
        List<ParkingLot> plots = Arrays.asList(p1, p2, p3);
        plots.stream().forEach(ParkingLot::start);
        Car car = new Car(plots, 1000);
        Dispatcher dispatcher = Dispatcher.getInstance();
        dispatcher.setCar(car);
        car.start();



    }
}
