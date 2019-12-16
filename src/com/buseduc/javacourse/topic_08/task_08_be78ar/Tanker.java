package com.buseduc.javacourse.topic_08.task_08_be78ar;

public class Tanker extends CargoShip implements ShipInVoyage {
    boolean dangerCargo;

    int tonnage;
    public Tanker(boolean dangerCargo, int tonnage) {
        this.dangerCargo = dangerCargo;
        this.tonnage = tonnage;
    }

    @Override
    public boolean isShipWithCargo() {
        return true;
    }

    @Override
    public void toFloat() {
        super.toFloat();
    }
}
