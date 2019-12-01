package com.buseduc.javacourse.topic_09.task_97_ivanivanov;

public class ParkingTask {
    public static void main(String[] args) {
        ParkingLot a1 = new ParkingLot(null, false, true);
        ParkingLot b1 = new ParkingLot(null, false);
        ParkingLot c1 = new ParkingLot(null, false);
        ParkingLot a2 = new ParkingLot(null, false);
        ParkingLot b2 = new ParkingLot(null, true);
        ParkingLot c2 = new ParkingLot(null, false);
        ParkingLot a3 = new ParkingLot(null, false);
        ParkingLot b3 = new ParkingLot(null, false);
        ParkingLot c3 = new ParkingLot(null, false);
        a1.setNeighbours(new ParkingLot[]{a2, b1, null, null});
        a2.setNeighbours(new ParkingLot[]{a3, b2, a1, null});
        a3.setNeighbours(new ParkingLot[]{null, b3, a2, null});
        b1.setNeighbours(new ParkingLot[]{b2, c1, null, a1});
        b2.setNeighbours(new ParkingLot[]{b3, c2, a2, b1});
        b3.setNeighbours(new ParkingLot[]{null, c3, b2, a3});
        c1.setNeighbours(new ParkingLot[]{c2, null, null, b1});
        c2.setNeighbours(new ParkingLot[]{c3, null, c1, b2});
        c3.setNeighbours(new ParkingLot[]{null,null, c2, b3});
        Parking parking = new Parking(a1);
        parking.searchForFreeLot();

    }

}
