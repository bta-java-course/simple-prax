package com.buseduc.javacourse.topic_03.task_03_95_ivanivanov;

public abstract class Fourangle {
    private double height;
    private double base;
    public Fourangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
