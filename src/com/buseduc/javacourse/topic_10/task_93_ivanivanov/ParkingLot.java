package com.buseduc.javacourse.topic_10.task_93_ivanivanov;

public class ParkingLot extends Thread {
    boolean isFree;
    String title;
    long timeInterval;

    public ParkingLot(boolean isFree, String title, long timeInterval) {
        this.isFree = isFree;
        this.title = title;
        this.timeInterval = timeInterval;
    }
    public void run() {
        while (true) {
            try {
                Thread.sleep(this.timeInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.isFree = !this.isFree;
            Dispatcher dispatcher = Dispatcher.getInstance();
            dispatcher.getCar().informChange(this);
            System.out.println(this.title + " changed to " + this.isFree);
        }
    }
}
