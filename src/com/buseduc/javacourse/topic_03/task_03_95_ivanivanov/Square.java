package com.buseduc.javacourse.topic_03.task_03_95_ivanivanov;

public class Square extends Fourangle {

    public Square(double height) {
        super(height, height);
    }


    @Override
    public double getArea() {
        return Math.pow(this.getHeight(), 2);
    }

    @Override
    public double getPerimeter() {
        return this.getHeight() * 4;
    }
}
