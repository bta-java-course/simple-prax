package com.buseduc.javacourse.topic_09.task_97_ivanivanov;

public class ParkingLot {
    private ParkingLot[] neighbours = new ParkingLot[4];
    private boolean isFree;
    private boolean isStart;


    public ParkingLot(ParkingLot[] neighbours, boolean isFree) {
        this(neighbours, isFree, false);
    }

    public void setNeighbours(ParkingLot[] neighbours) {
        this.neighbours = neighbours;
    }

    public ParkingLot(ParkingLot[] neighbours, boolean isFree, boolean isStart) {
        this.neighbours = neighbours;
        this.isFree = isFree;
        this.isStart = isStart;
    }

    public void setNeighbour(ParkingLot lot, int index) {
        if (index < 0 || index > 4) return;
        neighbours[index] = lot;
    }
    public ParkingLot[] getNeighbours() {
        return neighbours;
    }

    public boolean isFree() {
        return isFree;
    }
}
