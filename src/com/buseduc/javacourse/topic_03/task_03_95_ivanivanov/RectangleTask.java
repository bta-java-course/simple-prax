package com.buseduc.javacourse.topic_03.task_03_95_ivanivanov;

public class RectangleTask {
    public static void main(String[] args) {
        Fourangle fourangle = new Rectangle(5, 3);
        System.out.println(fourangle.getArea() + " " + fourangle.getPerimeter());
        Fourangle square = new Square(2);
        System.out.println(square.getArea() + " " + square.getPerimeter());
        Fourangle romb = new Romb( 4, 5);
        System.out.println(romb.getArea() + " " + romb.getPerimeter());
    }
}
