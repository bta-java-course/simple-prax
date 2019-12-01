package com.buseduc.javacourse.topic_09.task_97_ivanivanov;

public class Parking {
    private ParkingLot startLot;
    private int direction;

    public Parking(ParkingLot startLot) {
        this.startLot = startLot;
    }
    public ParkingLot searchForFreeLot() {
        if (startLot.isFree()) return startLot;
        ParkingLot current = startLot;
        while (current!= null || !current.isFree()) {
            if(current.getNeighbours() != null) {
                current = current.getNeighbours()[direction];
            } else {
                ++direction;
            }
        }
        return current;
    }
}
