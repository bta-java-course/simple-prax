package com.buseduc.javacourse.topic_03.task_03_95_ivanivanov;

public class Romb extends Fourangle {

    public Romb(double height, double base) {
        super(height, base);
    }


    @Override
    public double getArea() {
        return this.getBase() * this.getHeight();
    }

    @Override
    public double getPerimeter() {
        double katets = Math.pow(this.getBase() / 2, 2) * Math.pow(this.getHeight() / 2, 2);
        return Math.sqrt(katets) * 4;
    }
}
