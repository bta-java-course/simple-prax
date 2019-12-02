package com.buseduc.javacourse.topic_09.task_97_ivanivanov;

import java.util.Stack;

public class Parking {
    private ParkingLot startLot;
    private Stack<ParkingLot> path = new Stack<>();
    private int direction;

    public Parking(ParkingLot startLot) {
        this.startLot = startLot;
    }
    public ParkingLot searchForFreeLot() {
        if (startLot.isFree()) return startLot;
        ParkingLot current = startLot;
        path.push(current);
        while (current != null || !current.isFree() || !current.isVisited()) {
            current.setVisited(true);
            ParkingLot neighbor = current.getNeighbours()[direction];
            if(neighbor != null && !neighbor.isVisited()) {
                current = neighbor;
                path.push(current);
                if (current.isFree()) {
                    System.out.println("FOUND: "+ current.getName());
                    return current;
                }
                System.out.println(current.getName());
            } else {
                boolean foundNotVisited = false;
                for(ParkingLot ns: current.getNeighbours()) {
                    if(ns != null && !ns.isVisited()) {
                        foundNotVisited = true;
                    }
                }
                if (!foundNotVisited) {
                    break;
                }
                direction = ++direction % 4;
            }
        }
        System.out.println("Not found ;(");
        return current;
    }

    ParkingLot goAway () {
        ParkingLot lastLot = null;
        while(!path.empty()) {
            lastLot = path.pop();
            System.out.println("Going out: " + lastLot.getName());
        }
        return lastLot;
    }
}
