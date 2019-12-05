package com.buseduc.javacourse.topic_10.task_93_ivanivanov;

import com.buseduc.javacourse.topic_09.task_97_ivanivanov.Parking;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car extends Thread {

    List<ParkingLot> parkLots;
    long waitLimit;
    long startTime;

    public Car(List<ParkingLot> parkLots, long waitLimit) {
        this.parkLots = parkLots;
        this.waitLimit = waitLimit;
    }

    public void run() {
        System.out.println("CAR IS COMING");
        ParkingLot found = findParkingLot();
        startTime = System.currentTimeMillis();
        while (true){
            if (System.currentTimeMillis() - startTime >= waitLimit) {
                System.out.println("EXIT: Time is over. Will leave parking");
                System.exit(0);
            }
        }
    }

    public ParkingLot findParkingLot() {
        ReentrantLock lock = new ReentrantLock();

        for(ParkingLot plot : this.parkLots) {
            if(plot.isFree) {
                return plot;
            }
        }
        return null;

    }
    public void informChange(ParkingLot plot) {
        if(plot.isFree) {
            plot.isFree = false;
            String message = "FOUND: " + plot.title;
            System.out.println("EXIT: " + message);
            System.exit(0);
        }
    }



}
