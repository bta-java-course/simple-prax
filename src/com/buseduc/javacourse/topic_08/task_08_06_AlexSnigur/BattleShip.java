package com.buseduc.javacourse.topic_08.task_08_06_AlexSnigur;

public class BattleShip extends Ship implements AircraftCarrier {

    private int airCrafts;

    public BattleShip(int airCrafts) {
        this.airCrafts = airCrafts;
    }

    @Override
    public void toFloat() {
        System.out.println("Авианосец идёт по морю ");
    }

    @Override
    public boolean hasAircraftsOnBoard() {
        return this.airCrafts >= 1;
    }
}
