package com.buseduc.javacourse.topic_03.task_16_be78ar;

public class Circle {
    private double radius;
    String name;

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double CircleLength (){
        return 2 * Math.PI * radius;
    }

    double CircleSquare (){
        return Math.PI * Math.pow(radius, 2.0);
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }
}
