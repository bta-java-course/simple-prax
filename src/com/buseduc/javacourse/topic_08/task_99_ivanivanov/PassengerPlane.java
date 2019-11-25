package com.buseduc.javacourse.topic_08.task_99_ivanivanov;

public class PassengerPlane extends Plane implements Charter {
    private int issueYear;

    public PassengerPlane(int issueYear) {
        this.issueYear = issueYear;
    }

    @Override
    public void toLand() {
        System.out.println("Passenger Plane is landing!");
    }

    @Override
    public boolean hasContractWithTourOp() {
        return this.issueYear > 1999;
    }
}
