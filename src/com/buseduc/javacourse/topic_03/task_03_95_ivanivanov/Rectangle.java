package com.buseduc.javacourse.topic_03.task_03_95_ivanivanov;

public class Rectangle extends Fourangle {
    public Rectangle(double height, double width) {
        super(height, width);
    }
    @Override
    public double getArea() {
        return this.getHeight() * this.getBase();
    }

    @Override
    public double getPerimeter() {
        return (this.getHeight() + this.getBase()) * 2;
    }
}
