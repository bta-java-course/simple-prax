package com.buseduc.javacourse.topic_09.task_97_ivanivanov;

public class ParkingLot {
    private ParkingLot[] neighbours;
    private boolean isFree;
    private String name;
    private boolean isStart;
    private boolean isVisited;


    public ParkingLot(String name, ParkingLot[] neighbours, boolean isFree) {
        this(name, neighbours, isFree, false);
    }

    public void setNeighbours(ParkingLot[] neighbours) {
        this.neighbours = neighbours;
    }

    public ParkingLot(String name, ParkingLot[] neighbours, boolean isFree, boolean isStart) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
